package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese un número entre 0 y 10 para calcular su factorial:");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 10) {
            System.out.println("El número ingresado está fuera del rango permitido.");
        } else {
            int factorial = 1;
            int contador = 1;

            while (contador <= numero) {
                factorial *= contador;
                contador++;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        sc.close();
		

	}

}
