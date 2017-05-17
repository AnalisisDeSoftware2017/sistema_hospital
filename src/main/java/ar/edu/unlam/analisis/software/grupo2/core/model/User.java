package ar.edu.unlam.analisis.software.grupo2.core.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @NotNull
    @NotEmpty
    @Size(max=100)
    @Column(unique = true)
    private String username;


    @NotNull
    @NotEmpty
    @Size(max=100)
    private String password;

    @NotNull
    @NotEmpty
    @Size(max=100)
    @Column(unique = true)
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

    @NotNull
    private Integer failedLogin;




}
