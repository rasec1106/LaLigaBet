package pe.ciberte.project.ApiUser.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.ciberte.project.ApiUser.dao.UserRepository;
import pe.ciberte.project.ApiUser.entity.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User findByDni(String dni) {
        return userRepo.findByDni(dni);
    }

    @Override
    public User findByUserName(String userName) {
        return userRepo.findByUserName(userName);
    }

    @Override
    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public Optional<User> findByUserNameOrEmailOrDni(String userName, String email, String dni) {
        return userRepo.findByUserNameOrEmailOrDni(userName, email, dni);
    }

    @Override
    public Boolean existsByDni(String dni) {
        return userRepo.existsByDni(dni);
    }

    @Override
    public Boolean existsByUserName(String userName) {
        return userRepo.existsByUserName(userName);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRepo.existsByEmail(email);
    }

    @Override
    public User findById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public User add(User user) {
        return userRepo.save(user);
    }

    @Override
    public User update(Long id, User user) {
        User userElement = userRepo.findById(id).get();
        userElement.setName(userElement.getName());
        userElement.setDni(userElement.getDni());
        userElement.setUserName(userElement.getUserName());
        userElement.setEmail(userElement.getEmail());
        userElement.setBalance(userElement.getBalance());
        return userRepo.save(userElement);
    }

    @Override
    public void delete(Long id) {
        User userElement = userRepo.findById(id).get();
        userRepo.delete(userElement);
    }

}
