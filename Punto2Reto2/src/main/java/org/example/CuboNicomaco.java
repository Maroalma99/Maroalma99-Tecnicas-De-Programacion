package org.example;

public class CuboNicomaco {  //Código para calcular los cubos de los N números
    public static void calcularCubos(int N) {  //se recibe el entero en representación de la cantidad de cubos a calcular
        int impar = 1;  // se inicializa la variable impar para la secuencia de números

        for (int i = 1; i <= N; i++) {   //ciclo de 1 hasta N, donde se realiza la operación
            int suma = 0; // variable inicializada y donde se acomulara las operaciones
            for (int j = 0; j < i; j++) { // bucle de ejecución donde se opera la suma con i= al número ingresado
                suma += impar; // se pone el valor actual del numero a la suma total
                impar += 2; // se pasa al siguiete número a procesar
            }
            System.out.println(i + "^3 = " + suma); //impresión
        }
    }

    public static void main(String[] args) {
       int N = 8;
       calcularCubos(N);
    }

}