package pe.cibertec.project.ApiTeam.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.project.ApiTeam.entity.Team;


public interface TeamRepository extends JpaRepository<Team, Long>{
    Team findByCountry(String country);
    Team findByLeague(String league);
}
