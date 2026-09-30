package Nagusia;

import java.util.Scanner;

public class PruebaOperacionesMatematicas {
	private static Scanner teklado = new Scanner(System.in);

	public static void main(String[] args) {
		//
		String opcion = "";
		double primero = 0.0;
		double segundo = 0.0;

		System.out.println("-------------------------------------");
		System.out.println("APLICACIÓN DE OPERACIONES MATEMATICAS");
		System.out.println("-------------------------------------");

		do {

			opcion = miMenu();

			if (!opcion.equals("5")) {
				
				System.out.println("Dame el primer numero: ");
				primero = Double.parseDouble(teklado.nextLine());
				
				System.out.println("Dame el segundo numero: ");
				segundo = Double.parseDouble(teklado.nextLine());
			}

			switch (opcion) {
			case "1":
				sumar(primero, segundo);
				break;
			case "2":
				restar(primero, segundo);
				break;
			case "3":
				producto(primero, segundo);
				break;
			case "4":
				division(primero, segundo);
				break;
			default:
				break;
			}

		} while (!opcion.equals("5"));

		System.out.println("Hasta la próxima");

		teklado.close();
	}

	private static String miMenu() {

		String opcion = "";

		// Presentar el menu de la aplicación
		System.out.println("\n(1) - Sumar.");
		System.out.println("(2) - Restar.");
		System.out.println("(3) - Producto.");
		System.out.println("(4) - División.");
		System.out.println("(5) - Salir.");
		System.out.print("Selecciona una opción: ");
		opcion = teklado.nextLine();

		return (opcion);
	}

	// Las funciones
	private static void sumar(double primero, double segundo) {

		System.out.println("La suma es: " + (primero + segundo));
	}

	private static void restar(double primero, double segundo) {
		System.out.println("La resta es: " + (primero - segundo));
	}

	private static void producto(double primero, double segundo) {
		System.out.println("El producto da como resultado: " + (primero * segundo));
	}

	private static void division(double primero, double segundo) {
		System.out.println("La división da como resultado: " + (primero / segundo));
	}

}
