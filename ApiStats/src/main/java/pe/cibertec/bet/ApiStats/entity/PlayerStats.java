import jakarta.persistence.Entity;
import lombok.Data;
package pe.cibertec.bet.ApiStats.entity;

@Entity
@Data
public class PlayerStats {
    
    private Long idPlayer;
    private String playerName;
    private Long goals;
    private Long assists;
    private Long minutesPlayed;
    private Long matchesPlayed;
    private Long shotsOnTarget;
    private Long dribblesCompleted;
    private Long interceptions;
    private Long aerialDuelsWon;
    private Long speed;
    private Long stamina;
    private Long saves;
    private Long yellowCards;
    private Long redCards;
}
