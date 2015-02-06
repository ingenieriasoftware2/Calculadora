/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author
 */
public class Main {
 
   
  
 public static  List<Float> lista = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        Expresion m = new Expresion();
        Comprobador c = new Comprobador();
         System.out.println("*la calculadora solo suma,resta,multiplica,divide Ejemplo: (40/2)*(4+50)/6+9 = 189");
        System.out.println("*Escribe una expresión a operar: ");
        Scanner leer = new Scanner(System.in);
        String expr = leer.nextLine();
        m.inicio_exprecion(expr);
    }

}
 
    


