package pe.ciberte.project.ApiUser.controller;

import java.util.List;
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

    @GetMapping("/findByUserName/{username}")
    public User findByUserName(@PathVariable String username) {
        return userServ.findByUserName(username);
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable Long id) {
        return userServ.findById(id);
    }

    @GetMapping("/findByEmail/{email}")
    public User findByEmail(@PathVariable String email) {
        return userServ.findByEmail(email);
    }

}
