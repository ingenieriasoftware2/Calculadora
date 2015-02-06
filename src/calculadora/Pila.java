/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;


/**
 *
 * @author
 */
public class Pila {
  final int MAXIMO =10;
  int t;
  char[]a;

    public Pila() {
        t=0;
        a= new char[MAXIMO];
    }
    public void initPila(){
        t=0;
    }
    public boolean  pilaVacia(){
        return t==0;
    }
    public int insPila(char objeto){
        if(t == MAXIMO-1)
            return -1;
        else{
            t++;
            a[t-1]=objeto;
        }
        return 1;
        }
    
    public char retiraPila(){
        if(pilaVacia() ){
            return '#';
        }
        else{
            t=t-1;
           return a[t];
        }
       
        }
    public char topePila(){
        if(pilaVacia()){
            return '#';            
        }
        else{
            return a[t-1];
        }
    }
      
}
