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
public class DivisionTest {
   Calculando c;
    public DivisionTest() {
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
    public void testDivision2Digitos(){
        assertEquals(2,c.division(4, 2),0);
    }
    @Test
    public void testDivisionEntreCero(){
        assertEquals(Double.NEGATIVE_INFINITY,c.division(-3, 0),0);
    }
    @Test
    public void testDivisionNegativos(){
        assertEquals(1.5,c.division(-3, -2),0);
    }
    @Test
    public void testDivisionDecimales(){
        assertEquals(2.1818,c.division(2.4, 1.1),.0001);
    }
}
