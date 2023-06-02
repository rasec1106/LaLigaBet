
package pe.cibertec.project.ApiPlayer.dao;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.project.ApiPlayer.entity.User;


public interface PlayerRepository extends JpaRepository<User , Long >{
        
      Optional<User> findByEmail(String email);
      Optional<User> findByUserName(String username);
      Optional<User> findByUserOrName (String username, String email);
      Optional<Boolean> existsByEmail(String email);
      Optional<Boolean> existsByUserName(String username);
}
