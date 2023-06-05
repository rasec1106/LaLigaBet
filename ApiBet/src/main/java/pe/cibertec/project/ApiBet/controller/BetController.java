package pe.cibertec.project.ApiBet.controller;

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
import pe.cibertec.project.ApiBet.entity.Bet;
import pe.cibertec.project.ApiBet.service.BetService;

/**
 *
 * @author Henrry
 */
@RestController
@RequestMapping("api/bet")
public class BetController {

    @Autowired
    private BetService betServ;

    @GetMapping("/findAll")
    public ResponseEntity<List<Bet>> findAll() {
        return new ResponseEntity<>(betServ.findAll(),
                HttpStatus.OK);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Bet> findById(@PathVariable Long idBet) {
        return new ResponseEntity<>(betServ.findById(idBet),
                HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Bet> add(@RequestBody Bet bet) {
        return new ResponseEntity<>(betServ.add(bet),
                HttpStatus.CREATED);
    }

    @PutMapping("/update/{idBet}")
    public ResponseEntity<Bet> update(@PathVariable Long idBet, @RequestBody Bet bet) {
        return new ResponseEntity<>(betServ.update(idBet, bet),
                HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idBet}")
    public void delete(@PathVariable Long idBet) {
        betServ.delete(idBet);
    }

}
