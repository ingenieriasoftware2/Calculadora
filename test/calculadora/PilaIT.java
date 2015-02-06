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
public class PilaIT {
    
    public PilaIT() {
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
     * Test of initPila method, of class Pila.
     */
    @Test
    public void testInitPila() {
        System.out.println("initPila");
        Pila instance = new Pila();
        instance.initPila();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pilaVacia method, of class Pila.
     */
    @Test
    public void testPilaVacia() {
        System.out.println("pilaVacia");
        Pila instance = new Pila();
        boolean expResult = false;
        boolean result = instance.pilaVacia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insPila method, of class Pila.
     */
    @Test
    public void testInsPila() {
        System.out.println("insPila");
        char objeto = ' ';
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.insPila(objeto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retiraPila method, of class Pila.
     */
    @Test
    public void testRetiraPila() {
        System.out.println("retiraPila");
        Pila instance = new Pila();
        char expResult = ' ';
        char result = instance.retiraPila();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of topePila method, of class Pila.
     */
    @Test
    public void testTopePila() {
        System.out.println("topePila");
        Pila instance = new Pila();
        char expResult = ' ';
        char result = instance.topePila();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
