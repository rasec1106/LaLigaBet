package pe.ciberte.project.ApiUser.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.ciberte.project.ApiUser.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByDni(String dni);

    User findByUserName(String userName);

    User findByEmail(String email);

    Optional<User> findByUserNameOrEmailOrDni(String userName, String email, String dni);

    Boolean existsByDni(String dni);

    Boolean existsByUserName(String userName);

    Boolean existsByEmail(String email);
    
}
