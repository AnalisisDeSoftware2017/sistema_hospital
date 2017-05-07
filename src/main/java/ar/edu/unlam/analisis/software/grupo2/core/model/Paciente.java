package ar.edu.unlam.analisis.software.grupo2.core.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by sbogado on 4/24/17.
 */
@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
public class Paciente extends Persona {

    //De aca puedo obtener los medicos que lo atienden :)
    @OneToMany(mappedBy = "paciente")
    public List<SituaciondDelPaciente> situaciones;

}
