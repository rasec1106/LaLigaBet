package pe.cibertec.project.ApiTeam.service;

import java.util.List;
import pe.cibertec.project.ApiTeam.entity.Team;


public interface TeamService {
    public List<Team> findAll();
    public Team findById(Long id);
    public Team findByCountry(String country);
    public Team findByLeague(String league);
    public Team add(Team team);
    public Team update(Long id, Team team);
    public void delete(Long id);
}
