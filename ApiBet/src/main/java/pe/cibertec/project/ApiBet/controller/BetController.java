package pe.cibertec.project.ApiBet.controller;

import java.util.List;
import java.util.Optional;
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
import pe.cibertec.project.ApiBet.dao.BetRepository;
import pe.cibertec.project.ApiBet.entity.Bet;

/**
 *
 * @author Henrry
 */
@RestController
@RequestMapping("api/bet")
public class BetController {

    @Autowired
    private BetRepository betRepo;

    @GetMapping("/findByGain1/{gain1}")
    public Bet findByGain1(@PathVariable Double gain1) {
        return betRepo.findByGain1(gain1);
    }

    @GetMapping("/findByDraWin/{draWin}")
    public Bet findByDraWin(@PathVariable Double draWin) {
        return betRepo.findByDraWin(draWin);
    }

    @GetMapping("/findByGain2/{gain2}")
    public Bet findByGain2(@PathVariable Double gain2) {
        return betRepo.findByGain2(gain2);
    }

    @GetMapping("/findByUserNameOrEmailOrDni/{email}")
    public Optional<Bet> findByGain1OrfindByDraWinOrfindByGain2(@PathVariable Double gain1,
            @PathVariable Double draWin, @PathVariable Double gain2) {
        return betRepo.findByGain1OrfindByDraWinOrfindByGain2(gain1, draWin, gain2);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Bet>> findAll() {
        return new ResponseEntity<>(betRepo.findAll(),
                HttpStatus.OK);
    }
/* sale rojo 
    @GetMapping("/findById/{id}") 
    public ResponseEntity<Bet> findById(@PathVariable Long idBet) {
        return new ResponseEntity<>(betRepo.findById(idBet),
                HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Bet> add(@RequestBody Bet bet) {
        return new ResponseEntity<>(betRepo.add(bet),
                HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Bet> update(@PathVariable Long idBet, @RequestBody Bet bet) {
        return new ResponseEntity<>(betRepo.update(idBet, bet),
                HttpStatus.OK);
    }
*/
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long idBet) {
        betRepo.delete(idBet);
    }

}
