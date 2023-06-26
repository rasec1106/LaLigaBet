    
package pe.cibertec.project.ApiPlayer.controller;

import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.project.ApiPlayer.entity.Player;
import pe.cibertec.project.ApiPlayer.service.PlayerService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/player")
public class PlayerController {
    
    @Autowired
    PlayerService playerService; 
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Player>> findAll(){
        return new ResponseEntity<>(playerService.findAll(),
                HttpStatus.OK);
    }
    
    @GetMapping("/findAdll/page/{page}/size/{size}")
    public ResponseEntity<Page<Player>> findAll(
      @PathVariable int page, @PathVariable int size){
        return new ResponseEntity<>(playerService.findAll(page,size),
        HttpStatus.OK);
    }
    
    @GetMapping("/findByPlayerNameContaining/playerName{playerName}/page/{page}/size/{size}")
    public ResponseEntity<Page<Player>> findByPlayerNameContaining(
    @PathVariable String playerName, @PathVariable int page, @PathVariable int size){
        return new ResponseEntity<>(playerService.findByPlayerNameContaining(playerName, page, size), 
        HttpStatus.OK);
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<Player> findById(@PathVariable Long idPlayer){
        return new ResponseEntity<>(playerService.findById(idPlayer),
        HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Player> add(@Validated@RequestBody Player player){
        return new ResponseEntity<>(playerService.add(player),
        HttpStatus.CREATED);
    }
    
    @PutMapping("/update/{id}")
    public void delete(@PathVariable Long idPlayer){
        playerService.delete(idPlayer);
    }
}