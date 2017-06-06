package ar.edu.unlam.analisis.software.grupo2.core.model;

public enum TipoDocumentoEnum {
		
	DNI("tipoDocumento.dni"),
	LE("tipoDocumento.le"),
	CI("tipoDocumento.ci");

	private String codigoDocumento;
	
	private TipoDocumentoEnum(String code){
		this.codigoDocumento=code;
	}
	
	public String getCodigoDocumento(){
		return this.codigoDocumento;
	}

}
