/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.project.ApiMatch.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.project.ApiMatch.Entity.Team;

/**
 *
 * @author Cesar.Herrera
 */
public interface TeamRepository extends JpaRepository<Team, Long>{
    
}
