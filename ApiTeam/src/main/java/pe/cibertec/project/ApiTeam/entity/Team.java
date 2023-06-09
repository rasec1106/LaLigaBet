package pe.cibertec.project.ApiTeam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;


@Entity
@Data
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private String league;
    private String foundationDate;
    private String stadium;
    private String coach;  
    @OneToMany(mappedBy ="team" )
    private List<Player> players;
}
