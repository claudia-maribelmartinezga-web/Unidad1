package UD2;
/*
 * 7. El programa recibirá una (oración )y nos dirá (cuántas palabras) tiene.
 *  Las (palabras) que el usuario introduzca, estarán separadas a 
 * través de un espacio y una oración nunca comenzará con un espacio.
 */

import java.util.Scanner;

public class ContarPalabras {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		// declaracion de variables
		String oracion;
		String[] palabras;
		int totalPalabras;
		// pedimos al usuario que ingrese una oracion
		System.out.println("Ingresa una oracion: ");
		oracion = teclado.nextLine();

		// cortamos la oracion en trozos por cada espacio " "
		palabras = oracion.split("");// guardamos la palabras en un array
		totalPalabras = palabras.length; // contamos cuantas palabras ahi en e
		System.out.println(" --- RESULTADO --- ");
		System.out.println("La oracion tiene " + totalPalabras + " palabras.");

		teclado.close();
	}

}
