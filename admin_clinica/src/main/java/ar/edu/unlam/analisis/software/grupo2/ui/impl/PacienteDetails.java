package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractPersonaDetails;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sbogado on 6/28/17.
 */


@Component
public class PacienteDetails extends AbstractPersonaDetails<Paciente> {

    @Override
    protected void showDetails(List<SituacionDelPaciente> situacionesDelPaciente) {
        situacionesDelPaciente.forEach(situacionDelPaciente -> {
            taConsultas.append(situacionDelPaciente.getMedico().getNombre() + " " + situacionDelPaciente.getMedico().getApellido() + " (" +
                    situacionDelPaciente.getEspecialidad().getNombreEspecialidad() + "): " + situacionDelPaciente.getDetalle() + "\n");
        });

    }


}
