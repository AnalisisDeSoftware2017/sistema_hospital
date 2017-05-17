package ar.edu.unlam.analisis.software.grupo2.core.services;

import ar.edu.unlam.analisis.software.grupo2.ApplicationControlPacientes;
import ar.edu.unlam.analisis.software.grupo2.CustomSpringApplicationContextLoader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.AssertTrue;

/**
 * Created by sbogado on 17/05/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ApplicationControlPacientes.class, loader=CustomSpringApplicationContextLoader.class)
public class EnconderTest {

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Test
    public void testPasswordEncoder(){
        Assert.assertTrue(passwordEncoder.matches("seeb143", passwordEncoder.encode("seeb143")));
    }
}
