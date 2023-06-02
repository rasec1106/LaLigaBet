
package pe.cibertec.project.ApiBet.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cesar.Henrry
 */
@RestController
@RequestMapping("api/bet")
public class TestController {
    
    @GetMapping("/test")
    public String testResponse(){
        return "<h1>Your application is working</h1>";
    }
}