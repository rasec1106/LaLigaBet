package pe.cibertec.project.ApiBet.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.Data;

/**
 *
 * @author Henrry
 */
@Entity
@Data
public class Bet {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idbet;
    private String Matchid;
    private Double Result;
    private Double Gain1;
    private Double DraWin;
    private Double Gain2;
    private Double FullBet;
    /*
    private String image;*/
}
  