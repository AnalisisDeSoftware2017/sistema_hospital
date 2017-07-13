package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;
import ar.edu.unlam.analisis.software.grupo2.core.model.Medico;
import ar.edu.unlam.analisis.software.grupo2.core.model.Paciente;
import ar.edu.unlam.analisis.software.grupo2.core.model.SituacionDelPaciente;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;
import ar.edu.unlam.analisis.software.grupo2.ui.customComponents.JComboBoxCustom;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class FormCreateSituacionDelPaciente extends AbstractFormCreate<SituacionDelPaciente> {
    private JComboBoxCustom<Especialidad> cmbEspecialidad;
    private List<Especialidad> especialidadList;
    private JComboBoxCustom<Paciente> cmbPaciente;
    private JComboBoxCustom<Medico> cmbMedico;
    private JEditorPane txtDetalle;
    private List<Medico> medicoList;

    public FormCreateSituacionDelPaciente(MessageSource messageSource) {
        super(messageSource);
        setLayout(null);

        JLabel lblMedico = new JLabel("Medico:");
        lblMedico.setBounds(171, 56, 61, 16);
        add(lblMedico);

        JLabel lblPaciente = new JLabel("Paciente:");
        lblPaciente.setBounds(171, 122, 61, 16);
        add(lblPaciente);

        JLabel lblEspecialidad = new JLabel("Especialidad:");
        lblEspecialidad.setBounds(171, 189, 112, 16);
        add(lblEspecialidad);

        cmbEspecialidad = new JComboBoxCustom();
        cmbEspecialidad.setBounds(171, 217, 285, 27);
        add(cmbEspecialidad);

        //TODO remove this and add in controller
        this.cmbEspecialidad.setModel(new DefaultComboBoxModel<>());


        JLabel lblDetalle = new JLabel("Detalle:");
        lblDetalle.setBounds(171, 256, 86, 16);
        add(lblDetalle);

        cmbMedico = new JComboBoxCustom();
        cmbMedico.setBounds(171, 83, 285, 27);
        cmbMedico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setearEspecialidades();
            }
        });
        add(cmbMedico);

        cmbPaciente = new JComboBoxCustom();
        cmbPaciente.setBounds(171, 150, 285, 27);
        add(cmbPaciente);

        txtDetalle = new JEditorPane();
        txtDetalle.setBounds(171, 284, 285, 293);
        add(txtDetalle);
    }


    @Override
    public SituacionDelPaciente getEntity() {
        this.entity.setEspecialidad(this.cmbEspecialidad.getSelectedElement());
        this.entity.setMedico(this.cmbMedico.getSelectedElement());
        this.entity.setPaciente(this.cmbPaciente.getSelectedElement());
        this.entity.setEspecialidad(this.cmbEspecialidad.getSelectedElement());
        this.entity.setDetalle(this.txtDetalle.getText());
        return this.entity;
    }

    @Override
    public void setEntity(SituacionDelPaciente entity) {
        this.entity = entity == null ? new SituacionDelPaciente() : entity;
        this.txtDetalle.setText(this.entity.getDetalle());
        if (null != this.entity.getPaciente()) {
            this.cmbPaciente.setSelectedValue(entity.getPaciente());
        }
        if (null != this.entity.getMedico()) {
            this.cmbMedico.setSelectedValue(entity.getMedico());
        }
    }

    private void setEspecialidadList(List<Especialidad> especialidades) {
        this.cmbEspecialidad.cleanAndAddAll(especialidades);
        if (null != entity) {
            this.cmbEspecialidad.setSelectedValue(entity.getEspecialidad());
        }
    }

    public void setMedicoList(List<Medico> medicos) {
        this.cmbMedico.setModel(new DefaultComboBoxModel<Medico>());
        this.cmbMedico.addAll(medicos);
        if (null != entity && null != entity.getMedico()) {
            this.cmbMedico.setSelectedValue(entity.getMedico());
        } else {
            this.cmbMedico.setSelectedIndex(0);
        }
        this.setearEspecialidades();
    }

    public void setPacienteList(List<Paciente> pacientes) {
        this.cmbPaciente.setModel(new DefaultComboBoxModel<Paciente>());
        this.cmbPaciente.addAll(pacientes);
        if (null != entity && null != entity.getPaciente()) {
            this.cmbPaciente.setSelectedValue(entity.getPaciente());
        } else {
            this.cmbMedico.setSelectedIndex(0);
        }

    }

    private void setearEspecialidades() {
        if (null == this.cmbMedico.getSelectedElement().getEspecialidades() || this.cmbMedico.getSelectedElement().getEspecialidades().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El medico seleccionado no tiene especialidades asignadas", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            List<Especialidad> listaEspecialidades = this.cmbMedico.getSelectedElement().getEspecialidades();
            Especialidad[] arrayEspecialidades = new Especialidad[listaEspecialidades.size()];
            arrayEspecialidades = listaEspecialidades.toArray(arrayEspecialidades);
            this.cmbEspecialidad.setModel(new DefaultComboBoxModel<>(arrayEspecialidades));
        }
    }
    
    @Override
    public void setTexto() {

    }

}
