
package pe.cibertec.project.ApiPlayer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class PlayerTeams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlayer;
    private String playerName;
    private String playerTeams; 
    private Long playerCountry; 
    private Long playeridioma;  
    
}
