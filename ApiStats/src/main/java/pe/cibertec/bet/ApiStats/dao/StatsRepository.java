package pe.cibertec.bet.ApiStats.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.cibertec.bet.ApiStats.entity.PlayerStats;

public interface StatsRepository extends JpaRepository<PlayerStats, Long>{
    
    Page<PlayerStats> findByNameContaining
        (String playerName, Pageable pageable);
    
}
