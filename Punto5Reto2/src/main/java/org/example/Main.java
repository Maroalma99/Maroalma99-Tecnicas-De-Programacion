  package org.example;
import org.w3c.dom.events.Event;

import java.util.Scanner;


public class Main {
    // se crea una función  para realizar factorial
     public static int fac(int a) {
         int f=1;
        for (int i = 1; i <= a; i++) {
           f *= i;
        }
       return f;
     }
        public static void main(String[] args) {
            // se definen las variables a utilizar
            Scanner sc = new Scanner(System.in);
            int R;
            float D;
            // se pide al usario los valores de n y m a utilizar
            System.out.println("Ingrese n ");
            int N = sc.nextInt();
            System.out.println("Ingrese m ");
            int M = sc.nextInt();
            // se realizan la formula pedida
            R = fac(M)*fac(N-M);
            D = fac(N)/R;
            // se muestra en pantalla el resultado
            System.out.println( "El resultado es "  + D );
        }
}