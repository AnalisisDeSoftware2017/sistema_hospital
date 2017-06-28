package ar.edu.unlam.analisis.software.grupo2.data;

import ar.edu.unlam.analisis.software.grupo2.core.model.Especialidad;

public class MedicoData extends PersonaData {

    private Especialidad especialidad;


    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
