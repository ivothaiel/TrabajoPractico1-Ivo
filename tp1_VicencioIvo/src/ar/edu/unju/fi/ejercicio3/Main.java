package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Declarando el escaner
		Scanner sc = new Scanner(System.in);
		
		//declarando la variable
		int num;
		
		System.out.println("Ingrese el numero para evaluar");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " Es par " + " y su triple es " + num*3);
	    
		}
		else if (num % 3 ==0) {
			System.out.println(num + " Es Impar " + " y su doble es " + num*2);
		}
		

	}

}
