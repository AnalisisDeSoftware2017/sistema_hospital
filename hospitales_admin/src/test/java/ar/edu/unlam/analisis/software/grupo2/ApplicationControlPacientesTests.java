package ar.edu.unlam.analisis.software.grupo2;

import ar.edu.unlam.analisis.software.grupo2.core.model.User;
import ar.edu.unlam.analisis.software.grupo2.core.services.impl.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by sbogado on 07/05/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ApplicationControlPacientes.class, loader=CustomSpringApplicationContextLoader.class)
public class ApplicationControlPacientesTests {

    @Autowired
    private UserService userService;


    @Test
    public void contextLoads() {
    }


    @Test
    @Rollback(value = false)
    public void testCreateUser(){
        User user = new User();
        user.setApellido("Bogado");
        user.setEmail("seebogado@gmail.com");
        user.setFechaCreacion(new Date());
        user.setActive(true);
        user.setLocked(false);
        user.setNombre("Sebastian Emanuel Enrique");
        user.setPassword("seeb143");
        user.setUsername("mys");
        userService.createUser(user);


        User user2 = new User();
        user2.setApellido("Bogado");
        user2.setEmail("seebogado@yahoo.com");
        user2.setFechaCreacion(new Date());
        user2.setActive(true);
        user2.setLocked(false);
        user2.setNombre("Sebastian Emanuel Enrique");
        user2.setPassword("seeb143");
        user2.setUsername("xplotion");

        userService.createUser(user2);

    }

}
