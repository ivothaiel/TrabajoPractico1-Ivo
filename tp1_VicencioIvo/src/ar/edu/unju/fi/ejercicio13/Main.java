package ar.edu.unju.fi.ejercicio13;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[8];
		
		for(int i = 0; i<numeros.length;i++) {
			System.out.println("Ingrese el numero para la posicion" + i + ":");
			numeros[i] = sc.nextInt();
			
			System.out.println("Indice\tValor");
			for (int i1 = 0;i1 < numeros.length; i1++) {
				System.out.println(i + "\t" + numeros[i]);
				
			}
		}
sc.close();
	}

}
