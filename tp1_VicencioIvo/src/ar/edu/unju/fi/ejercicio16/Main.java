package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Definir y crear un array para almacenar 5 elementos de tipo String
        String[] nombres = new String[5];

        // Solicitar al usuario que ingrese nombres por consola utilizando un bucle for
        System.out.println("Ingrese 5 nombres:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre " + (i + 1) + ":");
            nombres[i] = scanner.nextLine();
        }

        // Mostrar los valores guardados en el array utilizando un bucle while
        System.out.println("Valores en el array:");
        int contador = 0;
        while (contador < nombres.length) {
            System.out.println("Índice " + contador + ": " + nombres[contador]);
            contador++;
        }

        // Mostrar el tamaño del array
        System.out.println("Tamaño del array: " + nombres.length);

        // Solicitar al usuario que ingrese un índice para eliminar un elemento del arreglo
        byte indiceAEliminar;
        do {
            System.out.println("Ingrese el índice del elemento a eliminar:");
            indiceAEliminar = scanner.nextByte();
        } while (indiceAEliminar < 0 || indiceAEliminar >= nombres.length);

        // Eliminar el elemento del arreglo y realizar desplazamiento si es necesario
        for (int i = (int) indiceAEliminar; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = null; // Asignar espacio en blanco para eliminar el elemento

        // Mostrar nuevamente el arreglo después de la eliminación
        System.out.println("Valores en el array después de eliminar el elemento:");
        contador = 0;
        while (contador < nombres.length) {
            System.out.println("Índice " + contador + ": " + (nombres[contador] != null ? nombres[contador] : "[Espacio en blanco]"));
            contador++;
        }

        scanner.close();

	}

}
