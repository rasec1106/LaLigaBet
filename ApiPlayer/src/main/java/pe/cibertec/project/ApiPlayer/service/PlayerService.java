
package pe.cibertec.project.ApiPlayer.service;

import java.util.List;
import pe.cibertec.project.ApiPlayer.entity.Player;
import org.springframework.data.domain.Page;
import pe.cibertec.project.ApiPlayer.entity.PlayerTeams;


public interface PlayerService {
    
    public List<Player> findAll();
    public Page<Player> findAll(int page , int size);
    public Page<Player> findByPlayerNameContaining(String playerName, int page , int size);
    
    public Player findById(Long idPlayer);
    public Player add(Player player);
    public Player update(Long idPlayer, Player player);
    public void delete(Long idPlayer);
    
}
