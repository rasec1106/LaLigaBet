package pe.cibertec.project.ApiBet.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.util.Set;

/**
 * import pe.cibertec.project.ApiTeam
 */
import lombok.Data;

/**
 *
 * @author Henrry
 */
@Entity
@Data
@Table(name="EquipoVisita")
public class EquipoVisita {

    //llave primaria:ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotNull
    private Long id;
    @Column(name ="equiponame");
    private String equiponame;
    @Column(name ="jugadoresname");
    private String jugadoresname;

    /*
CREATE TABLE `equipos_apibet`.`Partido`  (
  `id` int NOT NULL,
  `Fecha` varchar(255) NOT NULL,
  `Estadio` varchar(255) NOT NULL,
  `Pais` varchar(255) NOT NULL,
  `Hora` varchar(255) NOT NULL,
  `Empate` varchar(255) NOT NULL,
  `GanaLocal` varchar(255) NOT NULL,
  `GanaVisita` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);*/
    //de muchos a muchos
    @ManyToMany
    //nombre de la tabla que se va a crear en mysql 
    @JoinTable(name = "Partido",
            joinColumns = @JoinColumn(name = "equipoLocalid", referencedColumnName = "id"),
            //el id_role se usa de la clase Role
            inverseJoinColumns = @JoinColumn(name = "equipoVisitaid", referencedColumnName = "id"))
    private Set<EquipoLocal> roles;

}
