
package pe.cibertec.project.ApiBet.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.cibertec.project.ApiBet.dao.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import pe.cibertec.project.ApiBet.entity.Bet;


/**
 *
 * @author Henrry
 */
@Service
public class BetServiceImpl implements BetService {

    @Autowired
    private BetRepository betRepo;

    
     @Override
    public Bet findByGain1(Double gain1) {
        return betRepo.findByGain1(gain1);
    }

    @Override
    public Bet findByDraWin(Double draWin) {
        return betRepo.findByDraWin(draWin);
    }

    @Override
    public Bet findByGain2(Double gain2) {
        return betRepo.findByGain2(gain2);
    }

    @Override
    public Optional<Bet> findByGain1OrfindByDraWinOrfindByGain2(Double gain1, Double draWin, Double gain2) {
        return betRepo.findByGain1OrfindByDraWinOrfindByGain2(gain1, draWin, gain2);
    }

    
    /*
findall
findbyId
add
update
delete*/
    @Override
    public Bet findById(Long idbet) {
        return betRepo.findById(idbet).orElse(null);
    }

    @Override
    public List<Bet> findAll() {
        return (List<Bet>) betRepo.findAll();
    }

    @Override
    public Bet add(Bet bet) {
        return betRepo.save(bet);
    }

    @Override
    public Bet update(Long id, Bet bet) {
        Bet targetBet = betRepo.findById(id).get();
        targetBet.setMatchid(bet.getMatchid());
        targetBet.setResult(bet.getResult());
        targetBet.setGain1(bet.getGain1());
        targetBet.setDraWin(bet.getDraWin());
        targetBet.setGain2(bet.getGain2());
        targetBet.setFullBet(bet.getFullBet());
        return betRepo.save(targetBet);
    }

    @Override
    public void delete(Long id) {
        Bet targetBet = betRepo.findById(id).get();
        betRepo.delete(targetBet);
    }

}
