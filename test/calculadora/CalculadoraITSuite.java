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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author MJPK5332
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({calculadora.ComprobadorIT.class, calculadora.ControladorIT.class, calculadora.PilaIT.class, calculadora.CalculandoIT.class, calculadora.ExpresionIT.class, calculadora.MainIT.class})
public class CalculadoraITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
