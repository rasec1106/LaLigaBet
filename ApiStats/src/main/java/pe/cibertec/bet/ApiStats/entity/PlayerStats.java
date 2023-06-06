package pe.cibertec.bet.ApiStats.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PlayerStats {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
