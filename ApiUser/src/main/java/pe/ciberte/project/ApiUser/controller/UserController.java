package pe.ciberte.project.ApiUser.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.ciberte.project.ApiUser.entity.User;
import pe.ciberte.project.ApiUser.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserService userServ;

    @GetMapping("/findByDni/{dni}")
    public User findByDni(@PathVariable String dni) {
        return userServ.findByDni(dni);
    }

    @GetMapping("/findByUserName/{userName}")
    public User findByUserName(@PathVariable String userName) {
        return userServ.findByUserName(userName);
    }

    @GetMapping("/findByEmail/{email}")
    public User findByEmail(@PathVariable String email) {
        return userServ.findByEmail(email);
    }

    @GetMapping("/findByUserNameOrEmailOrDni/{email}")
    public Optional<User> findByUserNameOrEmailOrDni(@PathVariable String userName,
            @PathVariable String email, @PathVariable String dni) {
        return userServ.findByUserNameOrEmailOrDni(userName, email, dni);
    }

    @GetMapping("/existsByDni/{dni}")
    public Boolean existsByDni(String dni) {
        return userServ.existsByDni(dni);
    }

    @GetMapping("/existsByUserName/{userName}")
    public Boolean existsByUserName(String userName) {
        return userServ.existsByUserName(userName);
    }

    @GetMapping("/existsByEmail/{email}")
    public Boolean existsByEmail(String email) {
        return userServ.existsByEmail(email);
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable Long id) {
        return userServ.findById(id);
    }

}
