/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author
 */
public class Calculando implements Controlador{



    public float suma(double a, double b) {
       return (float) (a+b);
      }

    public float resta(double a, double b) {
       return (float) (a-b);}

    public float multiplicacion(double a, double b) {
           return  (float) (a*b);
    }

    public float division(double a, double b) {
       return (float) (a/b);
    }




}
