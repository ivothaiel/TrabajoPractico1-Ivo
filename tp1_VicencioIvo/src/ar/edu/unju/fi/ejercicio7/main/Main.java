package ar.edu.unju.fi.ejercicio7.main;
import ar.edu.unju.fi.ejercicio7.model.Empleado;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//solicitar datos al usuario para un nuevo empleado
		System.out.println("Ingrese el nombre del empleado");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese el salario del empleado");
		double salario = sc.nextDouble();
		
		System.out.println("Ingrese el legajo del empleado");
		int legajo = sc.nextInt();
		
		
		//Creando el objeto empleado usando el constructor parametrizado
		Empleado empleado = new Empleado(nombre,salario,legajo);
		
		//mostrar datos del empleado antes del aumento
		System.out.println("Datos del empleado antes del aumento");
		empleado.mostrarDatos();
		
		//dar aumento
		empleado.darAumento();
		
		//mostrar los datos actuales despues del aumento
		System.out.println("\nDatos del empleado despues del aumento: ");
        empleado.mostrarDatos();
        
        sc.close();
		
		

	}

}

