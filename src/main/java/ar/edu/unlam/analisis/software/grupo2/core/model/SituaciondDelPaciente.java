package ar.edu.unlam.analisis.software.grupo2.core.model;

import javax.persistence.*;

/**
 * Created by sbogado on 4/25/17.
 */
@Entity
public class SituaciondDelPaciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;

}
