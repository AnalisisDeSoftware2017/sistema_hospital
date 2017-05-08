package ar.edu.unlam.analisis.software.grupo2.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by sbogado on 4/25/17.
 */
@Entity
public class SituaciondDelPaciente {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;

}
