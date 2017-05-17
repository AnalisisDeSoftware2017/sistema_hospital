package ar.edu.unlam.analisis.software.grupo2.core.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by sbogado on 07/05/17.
 */
@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
@Table(name = "usuarios_sistema")
public class User {
    @Id
    @GeneratedValue
    private Long id;


    @NotNull
    @NotEmpty
    @Size(max=100)
    private String username;


    @NotNull
    @NotEmpty
    @Size(max=100)
    private String password;

    @NotNull
    @NotEmpty
    @Size(max=100)
    private String email;

    @NotNull
    @NotEmpty
    @Size(max=100)
    private String nombre;

    @NotNull
    @NotEmpty
    @Size(max=100)
    private String apellido;
    
    @NotNull
    private Boolean isActive=false;

    @NotNull
    private Boolean isLocked=false;

    @NotNull
    private Date fechaCreacion=new Date();

    private Date lastLogin;






}
