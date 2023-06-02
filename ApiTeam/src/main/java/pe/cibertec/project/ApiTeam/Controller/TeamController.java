package pe.cibertec.project.ApiTeam.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.project.ApiTeam.entity.Team;
import pe.cibertec.project.ApiTeam.service.TeamService;


@RestController
@RequestMapping("/api/team")
public class TeamController {
    
    @Autowired
    TeamService teamService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Team>> findAll(){
        return new ResponseEntity<>(teamService.findAll(),
                HttpStatus.OK); 
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<Team> findById(@PathVariable Long id){
        return new ResponseEntity<>(teamService.findById(id),
                HttpStatus.OK); 
    }
    
    @GetMapping("/findByCountry/{country}")
    public ResponseEntity<Team> findByCountry(@PathVariable String country){
        return new ResponseEntity<>(teamService.findByCountry(country),
                HttpStatus.OK);
    }
    
    @GetMapping("/findByLeague")
    public ResponseEntity<Team> findByLeague(@PathVariable String league){
        return new ResponseEntity<>(teamService.findByLeague(league),
                HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Team> add(@RequestBody Team team){
        return new ResponseEntity<>(teamService.add(team),
                HttpStatus.CREATED);
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