package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractPersonaDetails;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.List;

/**
 * Created by sbogado on 6/28/17.
 */


@Component
public class MedicoDetails extends AbstractPersonaDetails<Medico> {

    private JTextArea taEspecialidades;

    public MedicoDetails(MessageSource messageSource) {
        super(messageSource);
        taEspecialidades = new JTextArea(16, 30);
        taEspecialidades.setEditable(false); // set textArea non-editable
        JScrollPane scrollPane = new JScrollPane(taEspecialidades);
        scrollPane.setBounds(39, 413, 480, 208);
        add(scrollPane);
    }


    @Override
    protected void showDetails(List<SituacionDelPaciente> situacionesDelPaciente) {
        situacionesDelPaciente.forEach(situacionDelPaciente -> {
            taConsultas.append(situacionDelPaciente.getPaciente().getNombre() + " " + situacionDelPaciente.getPaciente().getApellido() + " (" +
                    situacionDelPaciente.getEspecialidad().getNombreEspecialidad() + "): " + situacionDelPaciente.getDetalle() + "\n");
        });

    }

    @Override
    public void setEntity(Medico medico) {
        super.setEntity(medico);
        taEspecialidades.setText("");
        medico.getEspecialidades().forEach(especialidad -> {
            taEspecialidades.append(especialidad.getNombreEspecialidad() + "\n");
        });
    }

}
