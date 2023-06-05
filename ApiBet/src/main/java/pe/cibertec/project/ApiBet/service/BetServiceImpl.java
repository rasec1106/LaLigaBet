package pe.cibertec.project.ApiBet.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import pe.cibertec.project.ApiBet.entity.Bet;
import pe.cibertec.project.ApiBet.dao.BetRepository;

/**
 *
 * @author Henrry
 */
@Service

public class BetServiceImpl implements BetService {

    @Autowired
    private BetRepository betRepo;

    @Override
    public Bet findById(Long idBet) {
        return betRepo.findById(idBet).orElse(null);
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

    public Bet update(Long idBet, Bet bet) {
        Bet targetBet = betRepo.findById(idBet).get();
        targetBet.setCuotamax(bet.getCuotamax());
        targetBet.setCuotamin(bet.getCuotamin());
        return betRepo.save(targetBet);
    }

    @Override
    public void delete(Long idBet) {
        Bet targetBet = betRepo.findById(idBet).get();
        betRepo.delete(targetBet);
    }

    public Boolean existsByCuotamax(Double cuotamax) {
        return betRepo.existsByCuotamax(cuotamax);
    }

    public Boolean existsByCuotamin(Double cuotamin) {
        return betRepo.existsByCuotamin(cuotamin);
    }

}
