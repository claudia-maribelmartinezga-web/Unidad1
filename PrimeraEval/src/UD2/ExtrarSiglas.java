package UD2;
/*
 * 8. El programa recibirá un texto y extraerá sus siglas.
 *  Por ejemplo:
 *  Tren Articulado Ligero Goikoetxea Oriol: TALGO


 */

import java.util.Scanner;

public class ExtrarSiglas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// declaracion de variables
		String texto;
		String[] palabras;
		String siglas;
		String palabraActual;
		char primeraLetra;
		// pedimos al usuario que ingrese una oracion
		System.out.println("Ingresa un nombre: ");
		texto = teclado.nextLine();

		// cortamos el texto en un array de palabras usanso el espacio " "
		palabras = texto.split("");// guardamos la palabras en un array cortamos el texto en un arreglo de palabras
									// usando el espacio " "
		siglas = "";// variable acumuladora para guardar las siglas finales
		// verificamos que la palabra no esté vacía por si hay espacios dobles
		for (int i = 0; i < palabras.length; i++) {
			palabraActual = palabras[i];

			if (palabraActual.length() > 0) {
				// tomamos la primera letra índice-0 y la pasamos a mayúscula
				primeraLetra = Character.toLowerCase(palabraActual.charAt(0));

				siglas = siglas + primeraLetra;
			}
		}
		System.out.println(" --- RESULTADO --- ");
		System.out.println("Las siglas son: " + siglas);

		teclado.close();
	}

}


