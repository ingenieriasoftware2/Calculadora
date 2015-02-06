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
public class ExpresionIT {
    
    public ExpresionIT() {
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
     * Test of prioridad method, of class Expresion.
     * 
     * ANALIZADOR SINTACTICO
     * 
     */
    @Test
    public void testPrioridad() {
        Expresion instance = new Expresion();
       char opcion1 = '-';
       char opcion2 = '+';
       int result = instance.prioridad(opcion1, opcion2);
        assertEquals(0,result);
     }

    /**
     * Test of evaluativo method, of class Expresion.
     * Evalua si el signo existe, para realziar.
     */ 
     
   @Test
   public void testEvaluativo() {
       Expresion instance = new Expresion();
       char c = '=';
       boolean resultado = instance.evaluativo(c);
       assertEquals(false,resultado);
    }
    
}
