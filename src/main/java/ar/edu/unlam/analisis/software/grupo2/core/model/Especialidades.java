package ar.edu.unlam.analisis.software.grupo2.core.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by sbogado on 07/05/17.
 */
@Entity
@Getter @Setter @Data @NoArgsConstructor
public class Especialidades {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @NotEmpty
    @Size
    private String nombreEspecialidad;

    @ManyToMany
    //TODO ver como joinear la tabla
    private List<Medico> medicos;

}
