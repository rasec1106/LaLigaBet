package pe.cibertec.project.ApiTeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.project.ApiTeam.entity.Player;


public interface PlayerRepository extends JpaRepository<Player, Long>{
    
}
