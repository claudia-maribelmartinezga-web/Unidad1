package UD2;
/*
 * 3. El programa recibirá un (texto) y lo mostrará al revés.
 */

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		// Declaracion de variables
		String textoOriginal;
		String textoInvertido;
		char letraActual;
		
		// Pedimos al usuario que introduzca un texto
		System.out.println("Introduce un texto: ");
		textoOriginal = teclado.nextLine();

		textoInvertido = "";

		for (int i = textoOriginal.length() -1 ;i >= 0; i--) {
			letraActual = textoInvertido.charAt(i);
			textoInvertido = textoInvertido + letraActual;

		}

		System.out.println("/n------RESULTADO------");
		System.err.println("El texto original es: " + textoOriginal);
		System.out.println("El texto invertido es: " + textoInvertido);
		teclado.close();
	}
	

}
