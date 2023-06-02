
package pe.cibertec.project.ApiPlayer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.Set;
import lombok.Data;

@Entity
@Data
public class User {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name; 
   private String userName;  
   private String password;  
    
   @ManyToMany
   @JoinTable(name = "User_Players",
           joinColumns = @JoinColumn(name="userid", referencedColumnName = "id"),
           inverseJoinColumns = @JoinColumn(name = "roleid", referencedColumnName ="id"))
   private Set<Role> roles;
}
