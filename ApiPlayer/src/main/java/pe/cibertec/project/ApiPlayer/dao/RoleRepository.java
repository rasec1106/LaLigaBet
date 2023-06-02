
package pe.cibertec.project.ApiPlayer.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.project.ApiPlayer.entity.Role;


public interface RoleRepository  extends JpaRepository<Role,Long >{
    
    Optional<Role> findByName(String name);
    
    
}
