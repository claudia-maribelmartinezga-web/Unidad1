package UD3;

import java.util.Scanner;

/*
 * 3. El programa recibirá un texto y lo mostrará al revés.
 */
public class InvertirTexto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Declaracion de variables
		String textoOriginal;
		String textoInvertido;
		char letraActual;
		System.out.println("Ingresa un texto o frase:");
		textoOriginal = teclado.nextLine();
		// Variable donde iremos construyendo texto al reves
		textoInvertido = "";
		// Bucle for que donde ahi que empezar el ultimo indice y el retroceso hasta el
		// primero que empieza por 0
		for (int i = textoOriginal.length() - 1; i >= 0; i--) {
			// utilizo la variable textoOriginal.length() - 1 porque si el texto mide 4
			// letras los indice van del 0 al 3
			letraActual = textoOriginal.charAt(i);// extraemos la letra actual empezando desde el final
			textoInvertido = textoInvertido + letraActual;// va contantondo las letras al revez y lo va sumando en
															// letraActual
		}

		System.out.println("--- RESULTADO ---");
		System.out.println("Texto original: " + textoOriginal);
		System.out.println("Texto al reves: " + textoInvertido);

		teclado.close();
	}

}
