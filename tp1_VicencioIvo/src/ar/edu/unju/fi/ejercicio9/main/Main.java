package ar.edu.unju.fi.ejercicio9.main;
import ar.edu.unju.fi.ejercicio9.model.Producto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos del producto " + i);
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Código: ");
            String codigo = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            System.out.print("Descuento (0-50): ");
            int descuento = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setCodigo(codigo);
            producto.setPrecio(precio);
            producto.setDescuento(descuento);

            System.out.println("\nDatos del producto\n " + i);
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: " + producto.calcularDescuento() + "\n");
        }

        scanner.close();
    }



	}


