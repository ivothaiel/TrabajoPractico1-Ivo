package ar.edu.unju.fi.ejercicio12.model;
import java.util.Calendar;
public class Persona {
private String nombre;
private Calendar fechaNacimiento;
public Persona() {
	super();
	// TODO Auto-generated constructor stub
}
public Persona(String nombre, Calendar fechaNacimiento) {
	super();
	this.nombre = nombre;
	this.fechaNacimiento = fechaNacimiento;
}

public int calcularEdad() {
    Calendar hoy = Calendar.getInstance();
    int edad = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
    if (hoy.get(Calendar.MONTH) < fechaNacimiento.get(Calendar.MONTH) ||
            (hoy.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH) &&
            hoy.get(Calendar.DAY_OF_MONTH) < fechaNacimiento.get(Calendar.DAY_OF_MONTH))) {
        edad--;
    }
    return edad;
}

public String obtenerSignoZodiaco() {
    int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
    int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Calendar.MONTH es zero-based
    String signo = "";
    if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
        signo = "Acuario";
    } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
        signo = "Piscis";
    } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
        signo = "Aries";
    } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
        signo = "Tauro";
    } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
        signo = "Géminis";
    } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
        signo = "Cáncer";
    } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
        signo = "Leo";
    } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
        signo = "Virgo";
    } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
        signo = "Libra";
    } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
        signo = "Escorpio";
    } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
        signo = "Sagitario";
    } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
        signo = "Capricornio";
    }
    return signo;
}

public String obtenerEstacion() {
    int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Calendar.MONTH es zero-based
    String estacion = "";
    switch (mes) {
        case 1:
        case 2:
            estacion = "Verano";
            break;
        case 3:
            estacion = "Otoño";
            break;
        case 4:
        case 5:
            estacion = "Invierno";
            break;
        case 6:
        case 7:
            estacion = "Primavera";
            break;
        case 8:
        case 9:
            estacion = "Verano";
            break;
        case 10:
        case 11:
            estacion = "Otoño";
            break;
        case 12:
            estacion = "Invierno";
            break;
        default:
            estacion = "Error: Mes no válido";
            break;
    }
    return estacion;
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Calendar getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(Calendar fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}


}
