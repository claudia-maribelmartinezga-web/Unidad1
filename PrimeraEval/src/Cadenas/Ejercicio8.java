 
package Cadenas;

import java.util.Scanner;

/**
 * 8. El programa recibirá un(texto) y extraerá sus( siglas). Por ejemplo:
 *  Tren Articulado Ligero Goikoetxea Oriol: TALGO
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		// Declaracion de variables
		String texto;
		String siglas;
		int posicion = 0;

		// Pedimos al usuario que ingrese una oracion
		System.out.print("Ingresa el nombre largo: ");
		texto = teclado.nextLine();

		// Quito los espacios en los lados
		texto = texto.trim();

		if (texto.length() > 0) {

			// Me quedo con la primera
			siglas = "" + texto.charAt(0);

			// Busco las siguientes
			while ((posicion = texto.indexOf(" ")) != -1) {

				// Cojo la siguiente al espacio en blanco
				siglas = siglas + texto.charAt(posicion + 1);
				texto = texto.substring(posicion + 1);
			}

			System.out.println("La siglas son: " + siglas.toUpperCase());
		} else {
			System.out.println("No seas perro, escribe algo.");
		}

		teclado.close();
	}
}
