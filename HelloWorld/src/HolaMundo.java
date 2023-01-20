/** Este es el primer proyecto de java, sigue en desarollo
 * @author Leonardo Xavier Pérez Balcorta
 * @version 0.1
 */


package HelloWorld.src;

public class HolaMundo { 

    /**
     * Este es el primer programa, no recibe parámetros e imprime HolaMundo desde la cosola
     * @param NONE
     * @return VOID 
     */

    public static void main (String[] args) { //Este método es fundamental para que el programa se ejecute

        char pi = 960;

        System.out.println(pi); //Las instrucciones terminan con ;

        String s1 = "La variable";

        System.out.println(s1);

        System.out.println(s1.length());

        System.out.println(s1.charAt(4));

        System.out.println(s1.toUpperCase() + " " + pi);
    } // fin del método 
}


/**
 * Para declarar varibles se usan varibles primitivas (inician con minusculas)
 * sintaxis - tipodedato identificador [= valor];
 * sintaxis - int edad = 39;
 * sintaxis - double area, base = 37, altura = 3;
 */


 