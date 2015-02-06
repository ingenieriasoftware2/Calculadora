/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;
import static org.junit.Assert.*;

/**
 *
 * @author MJPK5332
 */
public class CalculandoIT {
    
    public CalculandoIT() {
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
     * Test of suma method, of class Calculando.
     */
    @Test
    public void testSuma() {
        Calculando instance = new Calculando();
        double a = 2.0;
        double b = 2.0;
        double resultado = instance.suma(a, b);
        assertEquals(4.0,resultado, 1e-6);
     }

    /**
     * Test of resta method, of class Calculando.
     */
    @Test
    public void testResta() {
        Calculando instance = new Calculando();
        double a = 6.0;
        double b = 2.0;
        double resultado = instance.resta(a, b);
        assertEquals(4.0,resultado, 1e-6);
     }

    /**
     * Test of multiplicacion method, of class Calculando.
     */
    @Test
    public void testMultiplicacion() {
        Calculando instance = new Calculando();
        double a = 3.0;
        double b = 3.0;
        double resultado = instance.multiplicacion(a, b);
        assertEquals(9,resultado, 1e-6);
     }

    /**
     * Test of division method, of class Calculando.
     */
    @Test
    public void testDivision() {
        Calculando instance = new Calculando();
        double a = 4.0;
        double b = 2.0;
        double resultado = instance.division(a, b);
        assertEquals(2.0,resultado, 1e-6);
     }
    
}
