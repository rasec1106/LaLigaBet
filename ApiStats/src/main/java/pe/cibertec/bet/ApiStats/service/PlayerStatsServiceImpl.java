package pe.cibertec.bet.ApiStats.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pe.cibertec.bet.ApiStats.dao.StatsRepository;
import pe.cibertec.bet.ApiStats.entity.PlayerStats;
import pe.cibertec.bet.ApiStats.exception.EntityNotFoundException;

@Service
public class PlayerStatsServiceImpl implements PlayerStatsService{
    @Autowired
    private StatsRepository statsRepository;

    @Override
    public List<PlayerStats> findAll() {
        return (List<PlayerStats>) statsRepository.findAll();
    }
    
    @Override
    public Page<PlayerStats> findAll(int page, int size) {
        return statsRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public PlayerStats findById(Long idPlayer) {
        return statsRepository.findById(idPlayer).orElseThrow(()->
        new EntityNotFoundException("Player stats do not exists with id:" +idPlayer.toString()));  
    }
    
    @Override
    public PlayerStats add(PlayerStats playerStats) {
        return statsRepository.save(playerStats);
        
    }

    @Override
    public PlayerStats update(Long idPlayer, PlayerStats playerStats) {
        PlayerStats playerStatsDB = statsRepository.findById(idPlayer).get();
        playerStatsDB.setPlayerName(playerStats.getPlayerName());
        /*playerStatsDB.setEmail(customer.getEmail());
        playerStatsDB.setPhone(customer.getPhone());*/
        return statsRepository.save(playerStatsDB);
    }

    @Override
    public void delete(Long idPlayer) {
        PlayerStats playerStatsDB = statsRepository.findById(idPlayer).get();
        statsRepository.delete(playerStatsDB);
    }

    @Override
    public Page<PlayerStats> findByNameContaining(String playerName, int page, int size) {
        return statsRepository.findByNameContaining(playerName, PageRequest.of(page, size));
    }
}
