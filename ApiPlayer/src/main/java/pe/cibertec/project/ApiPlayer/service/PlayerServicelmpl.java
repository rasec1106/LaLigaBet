
package pe.cibertec.project.ApiPlayer.service;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pe.cibertec.project.ApiPlayer.dao.PlayersRepository;
import pe.cibertec.project.ApiPlayer.entity.Player;


@Service
public class PlayerServicelmpl implements PlayerService {

    @Autowired
    private PlayersRepository playerRepository;
    
    @Override
    public List<Player> findAll() {
        return (List<Player>) playerRepository.findAll();
        
    }
    
    @Override
    public Page<Player> findAll(int page, int size) {
      return playerRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public Page<Player> findByPlayerNameContaining(String playerName, int page, int size) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Player findById(Long idPlayer) {
       return playerRepository.findById(idPlayer).orElseThrow(() ->
       new EntityNotFoundException("Player teams dot not exists with id: "+ idPlayer.toString()));
    }

    @Override
    public Player add(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player update(Long idPlayer, Player player ) {
        Player playerDB = playerRepository.findById(idPlayer).get();
        playerDB.setPlayerName(player.getPlayerName());
        return playerRepository.save(playerDB);
        
    }

    @Override
    public void delete(Long idPlayer) {
       Player playerDB = playerRepository.findById(idPlayer).get();
    }
    
     @Override
     public Page<Player> findByPlayerNameContaining(String playerName, int page, int size){
         return playerRepository.findByNameContaining(playerName, PageRequest.of(page, size));
     }
    
}
