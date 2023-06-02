package pe.cibertec.project.ApiTeam.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.project.ApiTeam.dao.TeamRepository;
import pe.cibertec.project.ApiTeam.entity.Team;

@Service
public class TeamServiceImpl implements TeamService{
    @Autowired
    private TeamRepository teamRepository;

    @Override
    public List<Team> findAll() {
        return (List<Team>) teamRepository.findAll();
    }

    @Override
    public Team findById(Long id) {
        return teamRepository.findById(id).orElse(null);  
    }

    @Override
    public Team findByCountry(String country) {
        return teamRepository.findByCountry(country);
    }

    @Override
    public Team findByLeague(String league) {
        return teamRepository.findByLeague(league);
    }

    @Override
    public Team add(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team update(Long id, Team team) {
        Team teamDB = teamRepository.findById(id).get();
        teamDB.setName(team.getName());
        teamDB.setCountry(team.getCountry());
        teamDB.setLeague(team.getLeague());
        teamDB.setFoundationDate(team.getFoundationDate());
        teamDB.setStadium(team.getStadium());
        teamDB.setCoach(team.getCoach());
        
        return teamRepository.save(teamDB);
    }

    @Override
    public void delete(Long id) {
        Team teamDB = teamRepository.findById(id).get();
        teamRepository.delete(teamDB);
    }
    
}
