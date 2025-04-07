package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definición de variables
        int V;
        int B100 = 0;
        int B50= 0;
        int B20= 0;
        int B10= 0;
        int B5= 0;
        int B2= 0;
        int B1= 0;
        // Pedir el usario el valor a retirar
        System.out.println("Ingrese el monto que desea retirar: ");
        int N = sc.nextInt();
        V = N;
        // se hace un bucle para asignar la cantidad  de billetes en cada tipo denominacion
        while (V != 0) {
            if (V >= 100000) {
                V -= 100000;
                B100 += 1;
            } else if (V >= 50000) {
                V -= 50000;
                B50 += 1;
            } else if (V >= 20000) {
                V -= 20000;
                B20 += 1;
            } else if (V >= 10000) {
                V -= 10000;
                B10 += 1;
            } else if (V >= 5000) {
                V -= 5000;
                B5 += 1;
            } else if (V >= 2000) {
                V -= 2000;
                B2 += 1;
            } else {
                V -= 1000;
                B1 += 1;
            }

        }
        // se muestra en pantalla la cantidad de billetes
        System.out.println("El dinero a entregar es: " + N + " en " + B100 + " en billetes de 100.000,  " + B50 +  " en billetes de 50.000,  " + B20 +" en billetes de 20.000,  " + B10 + " en billetes de 10.000,  " + B5 + " en billetes de 5.000,  " + B2 + " en billetes de 2.000,  " + B1 + " en billetes de 1.000,  ");
        sc.close();
    }
}

