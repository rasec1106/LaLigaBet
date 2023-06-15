package pe.cibertec.bet.ApiStats.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Player {
    
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlayer;
    private String playerName;
    private String playerLastName;
    private Long playerAge;
    private Double playerHeight;
}