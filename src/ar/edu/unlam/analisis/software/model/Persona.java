package ar.edu.unlam.analisis.software.model;

/**
 * Created by sbogado on 4/24/17.
 */
public abstract class Persona {

    private String codigo;
    private String nombre;


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
