/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.project.ApiMatch.Controller;

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
import pe.cibertec.project.ApiMatch.Entity.Match;
import pe.cibertec.project.ApiMatch.Service.MatchService;

/**
 *
 * @author Cesar.Herrera
 */
@RestController
@RequestMapping("/api/match")
public class MatchController {
    
    @Autowired
    private MatchService matchService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Match>> findAll(){
        return new ResponseEntity<>(matchService.findAll(),
                HttpStatus.OK);   
    }
    
    @GetMapping("/findById/{id}") // we'll work with path variables
    public ResponseEntity<Match> findById(@PathVariable Long id){
        return new ResponseEntity<>(matchService.findById(id),
                HttpStatus.OK);   
    }
    
    @PostMapping("/add")
    public ResponseEntity<Match> add(@RequestBody Match match){
        return new ResponseEntity<>(matchService.add(match),
                HttpStatus.CREATED);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Match> update(@PathVariable Long id, @RequestBody Match match){
        return new ResponseEntity<>(matchService.update(id, match),
                HttpStatus.OK); 
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        matchService.delete(id);
    }
}
