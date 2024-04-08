package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.println("Ingrese el numero");
		num = sc.nextInt();
		
		if (num < 1 || num >9 ) {
			System.out.println("Fuera de rango");
			
				
		}else {
			 System.out.println("Tabla de multiplicar del número " + num + ":");
	            for (int i = 1; i <= 10; i++) {
	                System.out.println(num + " x " + i + " = " + (num * i));
	            }
	        }

	        sc.close();
		}
		

	}


