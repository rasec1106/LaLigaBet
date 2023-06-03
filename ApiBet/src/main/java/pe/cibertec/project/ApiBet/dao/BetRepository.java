package pe.cibertec.project.ApiBet.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import pe.cibertec.project.ApiBet.entity.Bet;

/**
 *
 * @author Henrry
 */
public interface BetRepository extends JpaRepository<Bet, Long>  {

    Bet findByGain1(Double gain1);

    Bet findByDraWin(Double draWin);

    Bet findByGain2(Double gain2);

    Optional<Bet> findByGain1OrfindByDraWinOrfindByGain2(Double gain1, Double draWin, Double gain2);

    public void delete(Long idBet);

    /*creo que acá tengo que agregar lo de controller pero no tengo idea me nuble*/
    
}
