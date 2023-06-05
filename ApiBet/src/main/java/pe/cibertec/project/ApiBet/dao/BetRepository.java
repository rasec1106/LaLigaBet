package pe.cibertec.project.ApiBet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.project.ApiBet.entity.Bet;

/**
 *
 * @author Henrry
 */
public interface BetRepository extends JpaRepository<Bet, Long> {

     Boolean existsByCuotamax(Double cuotamax);

     Boolean existsByCuotamin(Double cuotamin);

}
