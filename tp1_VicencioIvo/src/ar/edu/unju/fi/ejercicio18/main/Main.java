package ar.edu.unju.fi.ejercicio18.main;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    agregarDestinoTuristico(scanner, destinos);
                    break;
                case 2:
                    mostrarDestinosTuristicos(destinos);
                    break;
                // Agrega aquí los casos para las demás opciones del menú
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 9);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1 - Alta de destino turístico");
        System.out.println("2 - Mostrar todos los destinos turísticos");
        // Agrega aquí las opciones restantes del menú
        System.out.println("9 - Salir");
        System.out.println("Seleccione una opción:");
    }

    private static void agregarDestinoTuristico(Scanner scanner, ArrayList<DestinoTuristico> destinos) {
        System.out.println("\nIngrese los datos del destino turístico:");
        System.out.println("Código:");
        String codigo = scanner.nextLine();

        System.out.println("Nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Precio:");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("País:");
        String pais = scanner.nextLine();

        System.out.println("Cantidad de días:");
        int cantidadDias = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        DestinoTuristico destino = new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias);
        destinos.add(destino);
        System.out.println("Destino turístico agregado correctamente.");
    }

    private static void mostrarDestinosTuristicos(ArrayList<DestinoTuristico> destinos) {
        System.out.println("\nTodos los destinos turísticos:");
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino);
        }
    }

	}


