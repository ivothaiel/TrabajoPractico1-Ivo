package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		int j = 40;
        int i = 2;
        
        for (; j >= 0; i++, j -= 2) {
            int resultado = i * j;
            System.out.print(resultado + " ");
        }
	}

}
