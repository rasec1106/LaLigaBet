/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.project.ApiMatch.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.project.ApiMatch.Entity.Match;

/**
 *
 * @author Cesar Herrera
 */
// value is a key:value needed by syntaxis
// url is where our server is located
//@FeignClient(value = "feign-client", url = "http://apiscore:8080") // version without eureka server
@FeignClient(name = "apiscore")
public interface ApiRestClient {
    @GetMapping("/api/score/simulateMatch/{id}")
    public Match simulateMatch(@PathVariable Long id);
}
