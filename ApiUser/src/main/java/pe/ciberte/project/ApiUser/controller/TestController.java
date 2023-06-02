package pe.ciberte.project.ApiUser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class TestController {
    
    @GetMapping("/test")
    public String testResponse(){
        return "<h1>Your application is working</h1>";
    }
}