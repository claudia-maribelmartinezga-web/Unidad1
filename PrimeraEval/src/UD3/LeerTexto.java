package UD3;

import java.util.Scanner;

/*
 * 1. El programa leerá un texto y extraerá la siguiente información:

• Longitud

• El carácter en la posición 7.

• La posición donde aparece el primer carácter 'x' o si no existe, aparecerá un mensaje: “Carácter no encontrado”.

• Texto en mayúsculas.
 */

public class LeerTexto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// declaracion de variables
		String texto;
		int longitud;
		int posicionX;
		String textoMayusculas;
		char caracterPos7;
		System.out.println("Ingrese un texto: ");
		texto = teclado.nextLine();

		longitud = texto.length();
		System.out.println("Longitud del texto:" + longitud + " caracteres.");

		if (longitud >= 7) {
			caracterPos7 = texto.charAt(6);
			System.out.println("El caracter en la posicion 7 es: " + caracterPos7);
		} else {
			System.out.println("El texto es demaciado corto no tiene 7 caracteres.");
		}
		posicionX = texto.indexOf("x");
		if (posicionX != -1) {
			System.out.println("La primera 'x' aparece en la posicion " + posicionX + 1);
		} else {
			System.out.println("Caracter no encontrado");
		}
		 teclado.close();
	}

}
