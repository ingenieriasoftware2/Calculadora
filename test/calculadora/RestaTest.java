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
public class RestaTest {
  Calculando c;
    public RestaTest() {
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
    public void testResta2Digitos(){
        assertEquals(1,c.resta(6, 5),0);
    }
    @Test
    public void testRestaResultNegativo(){
        assertEquals(-2,c.resta(3, 5),0);
    }
    @Test
    public void testRestaCeros(){
        assertEquals(0,c.resta(0, 0),0);
    }
    @Test
    public void testRestaNegativos(){
        assertEquals(2,c.resta(0, -2),0);
    }
    @Test
    public void testRestaDecimales(){
        assertEquals(1.3,c.resta(2.4, 1.1),.02);
    }
}
