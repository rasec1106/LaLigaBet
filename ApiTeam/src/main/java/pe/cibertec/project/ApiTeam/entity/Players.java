package pe.cibertec.project.ApiTeam.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.List;


public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String fechNacimiento;
    private String posicion;
    private String nacionalidad;
    private String altura;
    private String peso;
    private String valorMercado;
    @ManyToOne
    private List<Team> team;
}
