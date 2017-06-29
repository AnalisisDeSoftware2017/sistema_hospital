package com.tssa.gilbco.pmob.cnfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author squintanilla
 *
 */
@Configuration
public class PasswordEncoderConfig {

	/**
	 * Este metodo esta aca, y no en SecurityConfig, porque sino no levanta la aplicacion por una referencia circular (SecurityConfig instanciaba este
	 * bean, y tambien utiliza otro bean, por autowired, que usaba a este)
	 * 
	 * @return
	 */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
