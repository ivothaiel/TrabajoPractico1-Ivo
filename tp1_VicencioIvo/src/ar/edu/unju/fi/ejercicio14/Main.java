package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero en el rango [3, 10]
        int tamañoArray;
        do {
            System.out.println("Ingrese un número entero en el rango [3, 10]:");
            tamañoArray = scanner.nextInt();
        } while (tamañoArray < 3 || tamañoArray > 10);

        // Crear un array de tipo entero con el tamaño ingresado por el usuario
        int[] numeros = new int[tamañoArray];

        // Solicitar al usuario que ingrese valores para cada posición del array
        int suma = 0;
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println("Ingrese un número entero para la posición " + i + ":");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        // Mostrar el valor de cada posición y la suma de todos los valores
        System.out.println("Valores del array:");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        System.out.println("Suma de todos los valores: " + suma);

        scanner.close();

	}

}
