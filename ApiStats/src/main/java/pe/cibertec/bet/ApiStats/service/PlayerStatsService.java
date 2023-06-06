package pe.cibertec.bet.ApiStats.service;

import java.util.List;
import org.springframework.data.domain.Page;
import pe.cibertec.bet.ApiStats.entity.PlayerStats;

public interface PlayerStatsService {
    
    public List<PlayerStats> findAll();
    public Page<PlayerStats> findAll(int page, int size);
    public Page<PlayerStats> findByNameContaining(String playerName, int page, int size);
    
    
    
    public PlayerStats findById(Long idPlayer);
    public PlayerStats add(PlayerStats playerStats);
    public PlayerStats update(Long idPlayer, PlayerStats playerStats);
    public void delete(Long idPlayer);
    
}
