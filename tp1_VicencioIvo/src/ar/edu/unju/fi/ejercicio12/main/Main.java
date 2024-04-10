package ar.edu.unju.fi.ejercicio12.main;
import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos de la persona
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese la fecha de nacimiento (formato dd/mm/yyyy):");
        String fechaNacimientoStr = scanner.nextLine();
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1; // Se resta 1 porque Calendar.MONTH es zero-based
        int anio = Integer.parseInt(partesFecha[2]);
        
        // Crear objeto Persona con la fecha de nacimiento proporcionada
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(anio, mes, dia);
        Persona persona = new Persona(nombre, fechaNacimiento);
        
        // Mostrar datos de la persona y resultados de los métodos
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + dia + "/" + (mes + 1) + "/" + anio);
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiaco());
        System.out.println("Estación del año: " + persona.obtenerEstacion());
        
        scanner.close();
    }

	}


