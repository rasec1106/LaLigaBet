package pe.cibertec.project.ApiBet.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.Data;
/*
import pe.cibertec.project.ApiUser.*;*/

/**
 *
 * @author Henrry
 */
@Entity
@Data
public class Bet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBet;
    private Long idUser;
    private Long idMacth;
    private Double Cuotamax;
    private Double Cuotamin;

    
}
  