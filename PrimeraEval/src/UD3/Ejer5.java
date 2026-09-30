package UD3;

import java.util.Scanner;

/*
 *


 */



public class Ejer5 {

	public static void main(String[] args) {
		   private static Scanner teclado = new Scanner(System.in);
		
		String opcion = "";

		do {
			opcion = miMenu();

			switch (opcion) {
			case "1":
				double resultadoSuma = suma();
				System.out.println("El resultado de la suma es: " + resultadoSuma);
				break;
			case "2":
				double resultadoResta = resta();
				System.out.println("El resultado de la resta es: " + resultadoResta);
				break;
			case "3":
				double resultadoMultiplicacion = multiplicacion();
				System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
				break;
			case "4":
				double resultadoDivision = division();
				if (resultadoDivision == -1) {
					System.out.println("Error: No se puede dividir entre 0.");
				} else {
					System.out.println("El resultado de la división es: " + resultadoDivision);
				}
				break;
			case "5":
				System.out.println("Saliendo de la calculadora...");
				break;
			default:
				System.out.println("Opción no válida. Por favor, introduce un número entre 1 y 5.");
				break;
			}

		} while (!opcion.equals("5"));

		System.out.println("Hasta la próxima");
		
	}

	private static String miMenu() {
		System.out.println("\nMenú calculadora");
		System.out.println("1.- Sumar");
		System.out.println("2.- Restar");
		System.out.println("3.- Multiplicar");
		System.out.println("4.- Dividir");
		System.out.println("5.- Salir");
		System.out.print("Introduce la opción deseada (1-5): ");
		return teclado.nextLine();
	}

	// Método auxiliar para pedir números positivos por teclado
	private static double pedirPositivo(String mensaje) {
		double num;
		do {
			System.out.print(mensaje);
			
			num = Double.parseDouble();
			if (num <= 0) {
				System.out.println("El número debe ser mayor que 0. Inténtalo de nuevo.");
			}
		} while (num <= 0);
		return num;
	}

	private static double suma() {
		System.out.println("\n--- SUMAR ---");
		double num1 = pedirPositivo("Introduce el primer número positivo: ");
		double num2 = pedirPositivo("Introduce el segundo número positivo: ");
		return num1 + num2;
	}

	private static double resta() {
		System.out.println("\n--- RESTAR ---");
		double num1 = pedirPositivo("Introduce el primer número positivo: ");
		double num2 = pedirPositivo("Introduce el segundo número positivo: ");
		return num1 - num2;
	}

	private static double multiplicacion() {
		System.out.println("\n--- MULTIPLICAR ---");
		double num1 = pedirPositivo("Introduce el primer número positivo: ");
		double num2 = pedirPositivo("Introduce el segundo número positivo: ");
		return num1 * num2;
	}

	private static double division() {
		System.out.println("\n--- DIVIDIR ---");
		double num1 = pedirPositivo("Introduce el dividendo (positivo): ");
		
		System.out.print("Introduce el divisor: ");
		double num2 = Double.parseDouble(null);

		if (num2 == 0) {
			
		}
		return num1 / num2;
	}
}


