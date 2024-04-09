package ar.edu.unju.fi.ejercicio8.main;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//Solicitar al usuario que ingrese el valor de n
			System.out.println("Ingrese el valor de n");
			int n = sc.nextInt();
			
			//crear objeto calculadora con el valor de n ingresado
			CalculadoraEspecial calculadora = new CalculadoraEspecial(n);
			
			//Mostrar el resultado de la sumatoria
			
			System.out.println("La sumatoria es " + calculadora.calcularSumatoria());
			
			//Mostrar el resultado de la productoria
			System.out.println("La productoria es: " + calculadora.calcularProductoria());
		}
		
	

	}

}
