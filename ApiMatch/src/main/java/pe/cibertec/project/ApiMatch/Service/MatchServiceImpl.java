/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.project.ApiMatch.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.project.ApiMatch.Dao.MatchRepository;
import pe.cibertec.project.ApiMatch.Entity.Match;

/**
 *
 * @author Cesar.Herrera
 */
@Service
public class MatchServiceImpl implements MatchService{

    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private ApiRestClient apiRestClient;
    
    @Override
    public List<Match> findAll() {
        return matchRepository.findAll();
    }

    @Override
    public Match findById(Long id) {
        return matchRepository.findById(id).get();
    }

    @Override
    public Match add(Match match) {
        return matchRepository.save(match);
    }

    @Override
    public Match update(Long id, Match match) {
        Match matchDB = matchRepository.findById(id).get();
        matchDB.setAwayTeam(match.getAwayTeam());
        matchDB.setAwayTeamScore(match.getAwayTeamScore());
        matchDB.setDate(match.getDate());
        matchDB.setHomeTeam(match.getHomeTeam());
        matchDB.setHomeTeamScore(match.getHomeTeamScore());
        matchDB.setLocation(match.getLocation());
        return matchRepository.save(matchDB);
    }

    @Override
    public void delete(Long id) {
        Match matchDB = matchRepository.findById(id).get();
        matchRepository.delete(matchDB);
    }

    @Override
    public Match simulateMatch(Long id) {        
        // process to call apiscore
        //Match simulated = apiRestClient.simulateMatch(id);
        Match simulated = matchRepository.findById(id).get();
        simulated.setHomeTeamScore(getRandomNumber());
        simulated.setAwayTeamScore(getRandomNumber());
        return matchRepository.save(simulated);        
    }
    private int getRandomNumber(){
        int min = 0;
        int max = 5;
        return (int) Math.floor(Math.random() * (max - min +1) + min);
    }
}
