package Nagusia;

import java.util.Scanner;

public class MetodoMenu {
	private static Scanner teklado = new Scanner(System.in);

	public static void main(String[] args) {
		//
		String opcion = "";

		System.out.println("-------------------------");
		System.out.println("APLICACIÓN DE BLA BLA BLA");
		System.out.println("-------------------------");

		do {

			opcion = miMenu();

			switch (opcion) {
			case "1":
				hazUno();
				break;
			case "2":
				hazDos();
				break;
			case "3":
				hazTres();
				break;
			case "4":
				hazCuatro();
				break;
			case "5":
				hazCinco();
				break;
			case "6":
				hazSeis();
				break;
			default:
				break;
			}

		} while (!opcion.equals("7"));

		System.out.println("Hasta la próxima");

		teklado.close();
	}

	private static String miMenu() {

		String opcion = "";

		// Presentar el menu de la aplicación
		System.out.println("\n(1) - Haz una cosa.");
		System.out.println("(2) - Haz dos cositas.");
		System.out.println("(3) - Haz tres cosas.");
		System.out.println("(4) - Haz cuatro cosas.");
		System.out.println("(5) - Haz cinco cosas.");
		System.out.println("(6) - Haz seis cosas.");
		System.out.println("(7) - Salir.");
		System.out.print("Selecciona una opción: ");
		opcion = teklado.nextLine();

		return (opcion);
	}
	
	// Las funciones
	private static void hazUno() {
		System.out.println("Hago lo del UNO ...");
	}
	
	private static void hazDos() {
		System.out.println("Hago lo del DOS ...");
	}
	
	private static void hazTres() {
		System.out.println("Hago lo del TRES ...");
	}
	
	private static void hazCuatro() {
		System.out.println("Hago lo del CUATRO ...");
	}
	
	private static void hazCinco() {
		System.out.println("Hago lo del QUINTO ...");
	}
	
	private static void hazSeis() {
		System.out.println("Hago lo del SEIS ...");
	}

}
