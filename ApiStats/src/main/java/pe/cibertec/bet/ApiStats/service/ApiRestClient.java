
package pe.cibertec.bet.ApiStats.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.bet.ApiStats.entity.Player;

@FeignClient(value="feign-client",url="http://apiplayer:8081/")
public interface ApiRestClient {
    
    @GetMapping("/api/player/findByIdPlayer/{idPlayer}")
    Player findByIdPlayer(@PathVariable Long idPlayer);
    
}
