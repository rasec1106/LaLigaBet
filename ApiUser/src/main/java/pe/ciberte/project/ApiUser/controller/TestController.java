/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ciberte.project.ApiUser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cesar.Herrera
 */
@RestController
@RequestMapping("api/user")
public class TestController {
    
    @GetMapping("/test")
    public String testResponse(){
        return "<h1>Your application is working</h1>";
    }
}