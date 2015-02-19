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
public class SumaTest {
    Calculando c;
    public SumaTest() {
      
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
    public void testSuma2Digitos(){
        assertEquals(8,c.suma(3, 5),0);
    }
    @Test
    public void testSumaCeros(){
        assertEquals(0,c.suma(0, 0),0);
    }
    @Test
    public void testSumaNegativos(){
        assertEquals(-2,c.suma(0, -2),0);
    }
    @Test
    public void testSumaDecimales(){
        assertEquals(3.5,c.suma(2.4, 1.1),0);
    }
}
