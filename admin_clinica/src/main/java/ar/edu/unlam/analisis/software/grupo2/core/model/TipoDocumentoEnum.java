package ar.edu.unlam.analisis.software.grupo2.core.model;

public enum TipoDocumentoEnum {
		
	DNI("tipoDocumento.dni",""),
	LE("tipoDocumento.le",""),
	CI("tipoDocumento.ci","");

	private String codigoDocumento;
	private String regex;

	TipoDocumentoEnum(String code,String rgx){
		this.codigoDocumento=code;
		this.regex=rgx;
	}
	
	public String getCodigoDocumento(){
		return this.codigoDocumento;
	}

	public String getRegex() {
		return regex;
	}
}
