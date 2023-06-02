package pe.cibertec.project.ApiTeam.service;

import java.util.List;
import pe.cibertec.project.ApiTeam.entity.Team;


public interface TeamService {
    public List<Team> findAll();
    public Team findById(Long id);
    public Team findByPais(String pais);
    public Team findByLiga(String liga);
    public Team add(Team customer);
    public Team update(Long id, Team team);
    public void delete(Long id);
}
