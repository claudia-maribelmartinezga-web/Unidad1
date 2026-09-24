package UD2;

/*
 * 2. El programa recibirá un texto y mostrará cuántas veces aparece la letra 'a'.
 */
import java.util.Scanner;

public class ContarLetraA {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Declaracion de variables
		String texto;
		int contador;
		String textoMinusculas;
		char letraActual;
		System.out.println("Ingresa un texto o frase:");
		texto = teclado.nextLine();
		contador = 0;
		// Convertimos el texto a minusculas para contar tanto 'a' como 'A' con el
		// toLowerCase
		textoMinusculas = texto.toLowerCase();
		// Recorrer el con el texto.length contamos la cantidad toda texto letra por
		// letra con un for yl de caracteres
		for (int i = 0; i < textoMinusculas.length(); i++) {
			// Extraer la letra en la posición 'i'
			letraActual = textoMinusculas.charAt(i);

			if (letraActual == 'a') {
				contador++;
			}
		}
		System.out.println("La letra 'a' aparece " + contador + " veces en el texto.");

        teclado.close();
	}

}
