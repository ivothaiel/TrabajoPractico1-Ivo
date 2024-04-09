package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
 private int n;
 
 public CalculadoraEspecial() {
	 //inicializacion por defecto
	 this.n = 0;
 }
 
 public CalculadoraEspecial(int n) {
	 this.n = n;
 }

public int getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}
 
 //Calculo de la sumatoria
public double calcularSumatoria() {
	double sumatoria = 0;
	for (int k = 1;k<=n;k++) {
		sumatoria+=(k*(k+1))/2.0;
		
	}
	return sumatoria;
}

public double calcularProductoria() {
	double productoria = 1;
	for (int k=1; k<=n;k++) {
		productoria*=(k*(k+1+4));
		
	}
	return productoria;
}

}
