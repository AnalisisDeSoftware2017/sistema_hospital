package ar.edu.unlam.analisis.software.grupo2.data;

import ar.edu.unlam.analisis.software.grupo2.core.model.TipoDocumentoEnum;

/**
 * Created by sbogado on 6/28/17.
 */
public abstract class PersonaData {
    private TipoDocumentoEnum tipoDocumento;

    private String numeroDocumento;

    private String codigo;

    private String nombre;

    private String apellido;

    private Boolean matchNumeroDocumento;

    private Boolean matcNombre;

    private Boolean matchApellido;

    private Boolean matchCodigo;

    public Boolean getMatchNumeroDocumento() {
        return matchNumeroDocumento;
    }

    public void setMatchNumeroDocumento(Boolean matchNumeroDocumento) {
        this.matchNumeroDocumento = matchNumeroDocumento;
    }

    public Boolean getMatcNombre() {
        return matcNombre;
    }

    public void setMatcNombre(Boolean matcNombre) {
        this.matcNombre = matcNombre;
    }

    public Boolean getMatchApellido() {
        return matchApellido;
    }

    public void setMatchApellido(Boolean matchApellido) {
        this.matchApellido = matchApellido;
    }

    public Boolean getMatchCodigo() {
        return matchCodigo;
    }

    public void setMatchCodigo(Boolean matchCodigo) {
        this.matchCodigo = matchCodigo;
    }

    public TipoDocumentoEnum getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoEnum tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
