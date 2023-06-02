package pe.cibertec.project.ApiTeam.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.project.ApiTeam.entity.Team;
import pe.cibertec.project.ApiTeam.service.TeamService;


@RestController
@RequestMapping("/api/team")
public class TeamController {
    
    @Autowired
    TeamService teamService;
    
    @GetMapping("/findAll")
    public List<Team> findAll(){
        return teamService.findAll();
    }
    @GetMapping("/findById/{id}")
    public Team findById(@PathVariable Long id){
        return teamService.findById(id);
    }
    
    @GetMapping("/findByPais/{pais}")
    public Team findByPais(@PathVariable String pais){
        return teamService.findByPais(pais);
    }
    
    @GetMapping("/findByLiga")
    public Team findByLiga(@RequestParam String liga){
        return teamService.findByLiga(liga);
    }
    
    @PostMapping("/add")
    public Team add(@RequestBody Team team){
        return teamService.add(team);
    }
    
    @PutMapping("/update/{id}")
    public Team update(@PathVariable Long id,
            @RequestBody Team team){
        return teamService.update(id, team);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        teamService.delete(id);
    }
    
}