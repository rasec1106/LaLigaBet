/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.project.ApiMatch.Service;

import java.util.List;
import pe.cibertec.project.ApiMatch.Entity.Match;

/**
 *
 * @author Cesar.Herrera
 */
public interface MatchService {
    public List<Match> findAll();
    public Match findById(Long id);
    public Match add(Match match);
    public Match update(Long id, Match match);
    public void delete(Long id);
    public Match simulateMatch(Long id);
}
