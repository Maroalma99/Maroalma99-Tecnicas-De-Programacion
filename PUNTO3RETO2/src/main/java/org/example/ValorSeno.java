package org.example;
import java.util.Scanner;

public class ValorSeno {

    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x para calcular seno: ");
        double x = scanner.nextDouble();

        System.out.print("Ingrese el número de términos n para la aproximación de seno(poner el radian en número decimal y usar como como separador decimal): ");
        int n = scanner.nextInt();

        double senx = 0;
        for (int i = 0; i < n; i++) {  // para calcular seno(x) usando la serie de Taylor
            double numerador = Math.pow(-1, i) * Math.pow(x, 2 * i + 1);
            double denominador = factorial(2 * i +1);
            senx += numerador  /  denominador;
        }
        System.out.println("\nValor aproximado de sin(" + x + ") con " + n + " términos: " + senx);

        scanner.close();
    }
}




