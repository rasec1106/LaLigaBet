package pe.cibertec.project.ApiBet.service;

import java.util.List;
import java.util.Optional;
import pe.cibertec.project.ApiBet.entity.Bet;

/**
 *
 * @author Henrry
 */
public interface BetService {

    Bet findByGain1(Double gain1);

    Bet findByDraWin(Double draWin);

    Bet findByGain2(Double gain2);

    Optional<Bet> findByGain1OrfindByDraWinOrfindByGain2(Double gain1, Double draWin, Double gain2);

    List<Bet> findAll();

    Bet findById(Long idbet);

    Bet add(Bet bet);

    Bet update(Long idbet, Bet bet);

    void delete(Long idbet);
}
