package ar.edu.unlam.analisis.software.grupo2;

import ar.edu.unlam.analisis.software.grupo2.controller.LoginController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by sbogado on 4/25/17.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"ar.edu.unlam.analisis.software.grupo2"})
public class ApplicationControlPacientes {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(ApplicationControlPacientes.class)
				.headless(false)
				.web(false)
				.run(args);
		LoginController loginController = context.getBean(LoginController.class);
		loginController.setVisible(true);
	}

}
