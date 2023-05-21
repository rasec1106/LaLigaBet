/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.project.ApiMatch.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cesar.Herrera
 */
@RestController
@RequestMapping("api/match")
public class TestController {
    
    @GetMapping("/test")
    public String testResponse(){
        return "<h1>Your application is working</h1>";
    }
    @GetMapping("/test2")
    public String testResponse2(){
        return "<h1>This is a test</h1>";
    }
}