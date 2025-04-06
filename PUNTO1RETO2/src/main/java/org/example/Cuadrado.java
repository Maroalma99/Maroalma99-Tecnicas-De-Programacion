package org.example;
import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese la cantidad de números N: "); // Lee el valor de N
        int N = sc.nextInt();   //se lee el número entero n que ingresa el usuario

        for (int i = 1; i <= N; i++) {     // bucle que Itera desde 1 hasta N, para calcular los cuadrados hasta llegar a n
            int cuadrado = 0;
            int numero = 1;

            for (int j = 0; j < i; j++) {    // Suma los primeros i números
                cuadrado += numero;
                numero += 2;
            }


            System.out.println(i + "^2 = " + cuadrado);  //Muestra resultado
        }

        sc.close();
    }
}




