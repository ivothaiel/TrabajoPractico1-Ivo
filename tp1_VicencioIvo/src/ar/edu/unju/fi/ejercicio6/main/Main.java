package ar.edu.unju.fi.ejercicio6.main;
import ar.edu.unju.fi.ejercicio6.model.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 // Creación de objeto Persona utilizando el constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Ingrese DNI:");
        int dni1 = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea después del entero
        System.out.println("Ingrese nombre:");
        String nombre1 = sc.nextLine();
        System.out.println("Ingrese fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaNacimiento1 = LocalDate.parse(sc.nextLine());

        // Setear los valores ingresados al objeto persona1
        persona1.setDni(dni1);
        persona1.setNombre(nombre1);
        persona1.setFechaNacimiento(fechaNacimiento1);

        // Mostrar los datos de la persona1
        System.out.println("Datos de la primera persona:");
        persona1.mostrarDatos();

        // Creación de objeto Persona utilizando el constructor parametrizado
        System.out.println("\nIngrese DNI:");
        int dni2 = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea después del entero
        System.out.println("Ingrese nombre:");
        String nombre2 = sc.nextLine();
        System.out.println("Ingrese fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaNacimiento2 = LocalDate.parse(sc.nextLine());
        System.out.println("Ingrese provincia:");
        String provincia2 = sc.nextLine();

        // Creación del objeto persona2 utilizando el constructor parametrizado
        Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, provincia2);

        // Mostrar los datos de la persona2
        System.out.println("\nDatos de la segunda persona:");
        persona2.mostrarDatos();

        // Creación de objeto Persona utilizando el constructor que inicializa solo dni, nombre y fecha de nacimiento
        System.out.println("\nIngrese DNI:");
        int dni3 = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea después del entero
        System.out.println("Ingrese nombre:");
        String nombre3 = sc.nextLine();
        System.out.println("Ingrese fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaNacimiento3 = LocalDate.parse(sc.nextLine());

        // Creación del objeto persona3 utilizando el constructor parametrizado
        Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);

        // Mostrar los datos de la persona3
        System.out.println("\nDatos de la tercera persona:");
        persona3.mostrarDatos();

        sc.close();
		
		
	}

}
