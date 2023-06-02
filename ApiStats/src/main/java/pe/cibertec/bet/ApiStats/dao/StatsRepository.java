
package pe.cibertec.bet.ApiStats.dao;
s
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.cibertec.bet.ApiStats.entity.PlayerStats;

public interface StatsRepository extends JpaRepository<PlayerStats Long>{
    //PlayerStats findByPlayer(String playerName);
    
    //@Query("select p from PlayerStats p where p.playerName = ?1")
    //Customer findByPlayer(String playerName);
    
    Page<PlayerStats> findByNameContaining
        (String playerName, Pageable pageable);
    
}
