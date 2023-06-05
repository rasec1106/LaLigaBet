package pe.cibertec.project.ApiBet.service;

import java.util.List;
import pe.cibertec.project.ApiBet.entity.Bet;

/**
 *
 * @author Henrry
 */
public interface BetService {

    List<Bet> findAll();

    Bet findById(Long idBet);

    Bet add(Bet bet);

    Bet update(Long idbet, Bet bet);

    void delete(Long idBet);
}
