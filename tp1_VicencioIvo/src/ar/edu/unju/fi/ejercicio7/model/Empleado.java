package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
private String nombre;
private double salario;
private int legajo;

//Constantes
private static final double salario_minimo = 210000.00;
private static final double aumento_por_meritos = 20000.00;



public Empleado() {
	super();
	
}


public Empleado(String nombre, double salario, int legajo) {
	super();
	this.nombre = nombre;
	//Logica para asignar el salario segun el salario minimo
	if (salario >= salario_minimo ) {
		this.salario = salario;
	}else {
		this.salario = salario_minimo;
	}
	
	this.legajo = legajo;
}

//mostrando datos del empleado

public void mostrarDatos() {
	System.out.println("Nombre del Empleado: "+ nombre);
	System.out.println("Legajo: " + legajo);
	System.out.println("Salario: " + "$"+salario );
}

//dando aumento de salario

public void darAumento() {
	salario+=aumento_por_meritos;
}

//getters and setters
public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public double getSalario() {
	return salario;
}


public void setSalario(double salario) {
	this.salario = salario;
}


public int getLegajo() {
	return legajo;
}


public void setLegajo(int legajo) {
	this.legajo = legajo;
}




}
