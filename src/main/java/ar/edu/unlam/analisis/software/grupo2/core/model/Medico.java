package ar.edu.unlam.analisis.software.grupo2.core.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by sbogado on 4/24/17.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
public class Medico extends Persona {

    @ManyToMany
    private List<Especialidades> especialidades;

    @OneToMany(mappedBy = "medico")
    private List<SituaciondDelPaciente> situaciones;
}
