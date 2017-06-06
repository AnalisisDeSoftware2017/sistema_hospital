package ar.edu.unlam.analisis.software.grupo2.core.model;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import java.awt.Component;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by sbogado on 4/24/17.
 */
@MappedSuperclass
@Getter @Setter @Data @NoArgsConstructor
public abstract class Persona extends AbmEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @Enumerated(EnumType.STRING)
    private TipoDocumentoEnum tipoDocumento;
    
    @NotNull @NotEmpty
    private String numeroDocumento;
    
    @NotNull
    @NotEmpty
    @Size(max=100)
    private String codigo;

    @NotNull
    @NotEmpty
    @Size(max=100)
    private String nombre;

    @NotNull
    @NotEmpty
    @Size(max=100)
    private String apellido;

    
    @Override
	public String getName() {
		return this.codigo + "\t"+ this.nombre +" "+this.apellido ;
	}
}
