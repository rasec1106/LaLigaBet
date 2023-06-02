package pe.cibertec.project.ApiTeam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;


@Entity
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String pais;
    private String liga;
    private String fechFundacion;
    private String estadio;
    private String entrenador;  
    @OneToMany(mappedBy ="team" )
    private List<Players> players;
}
