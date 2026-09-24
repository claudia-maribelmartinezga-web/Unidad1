package Cadenas;

import java.util.Scanner;

/*
 * 6. El programa recibirá un texto y 
 * nos dirá si es un palíndromo.
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto;
		boolean esPalindromo;
		int longitud;

		System.out.print("Introduce un texto: ");
		// Quitamos espacios y pasamos a minusculas para comparar bien
		texto = teclado.nextLine().replace(" ", "").toLowerCase();

		esPalindromo = true;
		longitud = texto.length();

		// Recorremos solo hasta la mitad del texto
		for (int i = 0; i < longitud / 2; i++) {
	
			
			// Comparar el caracter desde el inicio i con su opuesto del final longitud -1 -i
			if (texto.charAt(i) != texto.charAt(longitud - 1 - i)) {
				esPalindromo = false;
				// Si no coicide salimos de bucle
				break;
			}
		}
		if (esPalindromo) {
			System.out.println("Es un palíndromo.");
		} else {
			System.out.println("No es un palíndromo.");
		}

		teclado.close();

	}

}
