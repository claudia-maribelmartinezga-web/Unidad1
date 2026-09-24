/**
 * 
 */
package Cadenas;

import java.util.Scanner;

/**
 * 7. El programa recibirá una (oración) y nos dirá (cuántas palabras) tiene.
 * Las palabras )que el usuario introduzca, estarán separadas a través de un
 * espacio y una oración nunca comenzará con un espacio
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Declaracion de variables
		String oracion;
		String[] palabras;
		int totalPalabras;
		// pedimos el primer texto
		System.out.println("Introduce una palabra o una oracion: ");
		oracion = teclado.nextLine();// guardamos lo que ha ingresado el usuario

		// Ahi que cortar por trozos te palabras que ha introducido por  el usuario 
		palabras = oracion.split("");

		// Contar las palabras que ahi
		totalPalabras = palabras.length;

		// Mostramos el resultado final
		System.out.println("-----RUSULTADO----");
		System.out.println("La oracios tiene  " + totalPalabras + " palabras.");
		// Cerramos el escaner
		teclado.close();
	}

}
