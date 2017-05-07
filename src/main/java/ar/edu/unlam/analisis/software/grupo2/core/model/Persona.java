package ar.edu.unlam.analisis.software.grupo2.core.model;

import com.sun.istack.internal.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;

/**
 * Created by sbogado on 4/24/17.
 */
@MappedSuperclass
public abstract class Persona {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @NotEmpty
    @Size(max=100)
    private String codigo;

    @NotNull
    @NotEmpty
    @Size(max=100)
    private String nombre;

    @NotNull
    @NotEmpty
    @Size(max=100)
    private String apellido;

}
