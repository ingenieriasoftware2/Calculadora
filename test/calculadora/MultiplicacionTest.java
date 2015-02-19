package calculadora;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo
 */
public class MultiplicacionTest {
    Calculando  c;
    public MultiplicacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new Calculando();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testMultiplicacion2Digitos(){
        assertEquals(30,c.multiplicacion(6, 5),0);
    }
    @Test
    public void testMultiplicacionCeros(){
        assertEquals(0,c.multiplicacion(0, 0),0);
    }
    @Test
    public void testMultiplicacionNegativos(){
        assertEquals(6,c.multiplicacion(-3, -2),0);
    }
    @Test
    public void testMultiplicacionDecimales(){
        assertEquals(2.64,c.multiplicacion(2.4, 1.1),0);
    }
    
}
