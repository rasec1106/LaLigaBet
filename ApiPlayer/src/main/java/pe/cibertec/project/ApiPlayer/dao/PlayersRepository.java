
package pe.cibertec.project.ApiPlayer.dao;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.project.ApiPlayer.entity.Player;


public interface PlayersRepository extends JpaRepository<Player , Long > {
    
    Page<Player>findByNameContaining
            (String playername, Pageable pageable);
            
    
    
}
    