/*
 
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
  * @author MJPK5332
 */
public class ComprobadorIT {
    
    public ComprobadorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of limpiarParentesis method, of class Comprobador.
     */
    @Test
    public void testLimpiarParentesis() {
        Comprobador instance = new Comprobador();
        String Prueba;
        Prueba="3+2*(2*2)+2"; //La cadena a ser modificada
        assertEquals("3+2*4.0+2",instance.limpiarParentesis(Prueba));
     }
    
}
