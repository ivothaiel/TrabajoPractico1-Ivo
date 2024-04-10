package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
private String nombre;
private String codigo;
private double precio;
private int descuento;


public Producto() {
	super();
	// constructor por defecto
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getCodigo() {
	return codigo;
}


public void setCodigo(String codigo) {
	this.codigo = codigo;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


public int getDescuento() {
	return descuento;
}


public void setDescuento(int descuento) {
	
	//verificar si el descuento esta dentro del rango [0,50]
	if (descuento>=0 && descuento<=50) {
		this.descuento = descuento;
	}else {
		//si el descuento esta fuera del rango asignar el valor maximo
		if (descuento<0) {
			this.descuento = 0;
		}else {
			this.descuento = 50;
		}
		System.out.println("Debe estar en el rango [0,50]");
	}
	
}
public double calcularDescuento() {
    double precioConDescuento = precio;
    if (descuento > 0 && descuento <= 50) {
        precioConDescuento = precio - (precio * descuento / 100.0);
    }
    return precioConDescuento;
}


}
