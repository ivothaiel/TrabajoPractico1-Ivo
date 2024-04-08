package ar.edu.unju.fi.model;
import java.time.LocalDate;
import java.time.Period;


public class Persona {
	//atributos
	private int dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	//constructores
	//constructor vacio
	
	public Persona() {
	}
	
	//constructor parametrizado
	
	
	public int getDni() {
		return dni;
	}
	
	public Persona(int dni, String nombre, LocalDate fechaNacimiento, String provincia) {
	
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	// Constructor que inicialice solo dni, nombre y fecha de nacimiento
    public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }

	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	//metodos adicionales
	public int calcularEdad() {
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, ahora);
		return periodo.getYears();
		
	}
	public boolean esMayorDeEdad() {
		int edad = calcularEdad();
		return edad >= 18;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("DNI: " + this.dni);
		System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
		System.out.println("Provincia: " + this.provincia);
		
		if (esMayorDeEdad()) {
			System.out.println("La persona es mayor de edad");
			
		}else {
			System.out.println("La persona no es mayor de edad");
		}
	}
	
}

