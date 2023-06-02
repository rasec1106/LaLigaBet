package pe.cibertec.project.ApiTeam.dao;


import org.springframework.data.repository.CrudRepository;
import pe.cibertec.project.ApiTeam.entity.Team;


public interface TeamRepository extends CrudRepository<Team, Long>{
    Team findByPais(String pais);
    
    Team findByLiga(String liga);
}
