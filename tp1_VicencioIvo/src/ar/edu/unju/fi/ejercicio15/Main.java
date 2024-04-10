package ar.edu.unju.fi.ejercicio15;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero en el rango [5, 10]
        int tamañoArray;
        do {
            System.out.println("Ingrese un número entero en el rango [5, 10]:");
            tamañoArray = scanner.nextInt();
        } while (tamañoArray < 5 || tamañoArray > 10);

        // Crear un array de tipo String con el tamaño ingresado por el usuario
        String[] nombres = new String[tamañoArray];

        // Solicitar al usuario que ingrese nombres para cada posición del array
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println("Ingrese un nombre para la posición " + i + ":");
            scanner.nextLine(); // Consumir el salto de línea pendiente
            nombres[i] = scanner.nextLine();
        }

        // Mostrar el valor de cada posición comenzando desde el primer índice 0
        System.out.println("Contenido del array (comenzando desde el primer índice 0):");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        // Mostrar el contenido del array comenzando con la última posición
        System.out.println("Contenido del array (comenzando desde la última posición):");
        for (int i = tamañoArray - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        scanner.close();

	}

}
