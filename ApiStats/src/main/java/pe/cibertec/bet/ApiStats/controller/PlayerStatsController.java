package pe.cibertec.bet.ApiStats.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.cibertec.bet.ApiStats.entity.PlayerStats;
import pe.cibertec.bet.ApiStats.service.PlayerStatsService;

@RestController
@RequestMapping("/api/playerStats")
public class PlayerStatsController {
    
    @Autowired
    PlayerStatsService playerStatsService;
    
    
    @GetMapping("/findAll")
    public ResponseEntity<List<PlayerStats>> findAll(){
        return new ResponseEntity<>(playerStatsService.findAll(),
                HttpStatus.OK);
    }
    
    @GetMapping("/findAll/page/{page}/size/{size}")
    public ResponseEntity<Page<PlayerStats>> findAll(
            @PathVariable int page,@PathVariable int size){
        return new ResponseEntity<>(playerStatsService.findAll(page,size),
                HttpStatus.OK);
    }
    
    @GetMapping("/findByNameContaining/name/{name}/page/{page}/size/{size}")
    public ResponseEntity<Page<PlayerStats>> findByNameContaining(
            @PathVariable String playerName, @PathVariable int page,@PathVariable int size){
        return new ResponseEntity<>(playerStatsService.findByNameContaining(playerName,page,size),
                HttpStatus.OK);
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<PlayerStats> findById(@PathVariable Long idPlayer){
        return new ResponseEntity<>(playerStatsService.findById(idPlayer),
        HttpStatus.OK) ;
    }
    
    /*@GetMapping("/findByEmail/{email}")
    public ResponseEntity<Customer> findByEmail(@PathVariable String email){
        return new ResponseEntity<>(customerService.findByEmail(email),
        HttpStatus.OK) ;
    }
    
    @GetMapping("/findByPhone")
    public ResponseEntity<Customer> findByPhone(@RequestParam String phone){
        return new ResponseEntity<>(customerService.findByPhone(phone),
        HttpStatus.OK);
    }
    */
    //Se agrega un objeto ResponseEntity con 3 componentes: Body, Status code, Header
    
    @PostMapping("/add")
    public ResponseEntity<PlayerStats> add(@Validated@RequestBody PlayerStats playerStats){
        return new ResponseEntity<>(playerStatsService.add(playerStats),
        HttpStatus.CREATED) ;
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity <PlayerStats> update(@PathVariable Long idPlayer,
            @RequestBody PlayerStats playerStats){
        return new ResponseEntity<>(playerStatsService.update(idPlayer, playerStats),
        HttpStatus.OK) ;
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long idPlayer){
        customerService.delete(idPlayer);
    }
    
    
}
