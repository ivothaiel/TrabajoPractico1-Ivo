package ar.edu.unju.fi.ejercicio17.main;
import ar.edu.unju.fi.ejercicio17.model.Jugador;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    agregarJugador(scanner, jugadores);
                    break;
                case 2:
                    mostrarDatosJugador(scanner, jugadores);
                    break;
                case 3:
                    mostrarJugadoresOrdenadosPorApellido(jugadores);
                    break;
                case 4:
                    modificarDatosJugador(scanner, jugadores);
                    break;
                case 5:
                    eliminarJugador(scanner, jugadores);
                    break;
                case 6:
                    mostrarCantidadTotalJugadores(jugadores);
                    break;
                case 7:
                    mostrarCantidadJugadoresPorNacionalidad(scanner, jugadores);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 8);

        scanner.close();
    }

    private static void mostrarCantidadJugadoresPorNacionalidad(Scanner scanner, ArrayList<Jugador> jugadores) {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarCantidadTotalJugadores(ArrayList<Jugador> jugadores) {
		// TODO Auto-generated method stub
		
	}

	private static void eliminarJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1 - Alta de jugador");
        System.out.println("2 - Mostrar los datos del jugador");
        System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
        System.out.println("4 - Modificar los datos de un jugador");
        System.out.println("5 - Eliminar un jugador");
        System.out.println("6 - Mostrar la cantidad total de jugadores");
        System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
        System.out.println("8 - Salir");
        System.out.println("Seleccione una opción:");
    }

    private static void agregarJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        System.out.println("\nIngrese los datos del jugador:");

        System.out.println("Nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Apellido:");
        String apellido = scanner.nextLine();

        System.out.println("Fecha de nacimiento (formato dd/mm/yyyy):");
        String fechaStr = scanner.nextLine();
        String[] partesFecha = fechaStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1; // Calendar.MONTH es zero-based
        int anio = Integer.parseInt(partesFecha[2]);
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(anio, mes, dia);

        System.out.println("Nacionalidad:");
        String nacionalidad = scanner.nextLine();

        System.out.println("Estatura:");
        double estatura = scanner.nextDouble();

        System.out.println("Peso:");
        double peso = scanner.nextDouble();

        System.out.println("Posición:");
        String posicion = scanner.next();

        Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
        jugadores.add(jugador);
        System.out.println("Jugador agregado correctamente.");
    }

    private static void mostrarDatosJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        System.out.println("\nIngrese el nombre y apellido del jugador:");
        String nombre = scanner.nextLine();
        String apellido = scanner.nextLine();

        boolean encontrado = false;
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("\nDatos del jugador:");
                System.out.println(jugador);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Jugador no encontrado.");
        }
    }

    private static void mostrarJugadoresOrdenadosPorApellido(ArrayList<Jugador> jugadores) {
        ArrayList<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
        Collections.sort(jugadoresOrdenados, Comparator.comparing(Jugador::getApellido));
        System.out.println("\nJugadores ordenados por apellido:");
        for (Jugador jugador : jugadoresOrdenados) {
            System.out.println(jugador);
        }
    }

    private static void modificarDatosJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        System.out.println("\nIngrese el nombre y apellido del jugador a modificar:");

	}

}
