package ar.edu.unlam.analisis.software.grupo2.utils;

import ar.edu.unlam.analisis.software.grupo2.ApplicationControlPacientes;
import ar.edu.unlam.analisis.software.grupo2.CustomSpringApplicationContextLoader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.regex.Pattern;

/**
 * Created by sbogado on 6/22/17.
 */

public class ValidationsHelperTest {


    /*private String pattern = "^[A-Za-z]+[A-z\\u00C0-\\u00ff ]+\\S";*/
    private String pattern = "^[A-Za-z\\u00C0-\\u00ff ]+$";

    @Test
    public void testUser1(){
        String name = "Sebastian";
        Assert.assertTrue(name.matches(pattern));

    }
    @Test
    public void testUser2(){
        String name = "Sebastián Emanuel";
        Assert.assertTrue(name.matches(pattern));
    }
    @Test
    public void testUser3(){
        String name = "`asdf";
        Assert.assertFalse(name.matches(pattern));
    }
    @Test
    public void testUser4(){
        String name = "9ebastian";
        Assert.assertFalse(name.matches(pattern));
    }

    @Test
    public void testUser5(){
        String name = "Rapetti";
        Assert.assertTrue(name.matches(pattern));
    }

    @Test
    public void testUser6(){
        String name = "InterInterInterInterInterInterInterInterInter";
        Assert.assertTrue(name.matches(pattern));
    }
    @Test
    public void testUser7(){
        String name = "yao ";
        Assert.assertTrue(name.matches(pattern));
    }
    @Test
    public void testUser8(){
        String name = "Dadasdaia";
        Assert.assertTrue(name.matches(pattern));
    }

}
