package pe.ciberte.project.ApiUser.service;

import java.util.List;
import java.util.Optional;
import pe.ciberte.project.ApiUser.entity.User;

public interface UserService {

    User findByDni(String dni);

    User findByUserName(String userName);

    User findByEmail(String email);

    Optional<User> findByUserNameOrEmailOrDni(String userName, String email, String dni);

    Boolean existsByDni(String dni);

    Boolean existsByUserName(String userName);

    Boolean existsByEmail(String email);

    User findById(Long id);

    List<User> findAll();

    User add(User user);

    User update(Long id, User user);

    void delete(Long id);

}
