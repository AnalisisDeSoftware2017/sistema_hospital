package ar.edu.unlam.analisis.software.grupo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by sbogado on 4/25/17.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"ar.edu.unlam.analisis.software.grupo2"})
public class ApplicationControlPacientes {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationControlPacientes.class, args);
	}
}
