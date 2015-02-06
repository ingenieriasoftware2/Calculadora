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
import static org.junit.Assert.*;

/**
 *
 * @author MJPK5332
 */
public class ControladorIT {
    
    public ControladorIT() {
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
     * Test of suma method, of class Controlador.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        double a = 0.0;
        double b = 0.0;
        Controlador instance = new ControladorImpl();
        float expResult = 0.0F;
        float result = instance.suma(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Controlador.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double a = 0.0;
        double b = 0.0;
        Controlador instance = new ControladorImpl();
        float expResult = 0.0F;
        float result = instance.resta(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class Controlador.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double a = 0.0;
        double b = 0.0;
        Controlador instance = new ControladorImpl();
        float expResult = 0.0F;
        float result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Controlador.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        double a = 0.0;
        double b = 0.0;
        Controlador instance = new ControladorImpl();
        float expResult = 0.0F;
        float result = instance.division(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ControladorImpl implements Controlador {

        public float suma(double a, double b) {
            return 0.0F;
        }

        public float resta(double a, double b) {
            return 0.0F;
        }

        public float multiplicacion(double a, double b) {
            return 0.0F;
        }

        public float division(double a, double b) {
            return 0.0F;
        }
    }
    
}
