package ar.edu.unlam.analisis.software.grupo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by sbogado on 07/05/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ApplicationControlPacientes.class, loader=CustomSpringApplicationContextLoader.class)
public class ApplicationControlPacientesTests {

    @Test
    public void contextLoads() {
    }

}
