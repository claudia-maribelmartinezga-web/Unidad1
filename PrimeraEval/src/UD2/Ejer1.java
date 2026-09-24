package UD2;

import java.util.Scanner;

/*
 * 1. El programa leerá un (texto) y extraerá la siguiente información:

•(Longitud)

• El( carácter en la posición 7).

• La (posición X) donde aparece el primer carácter 'x' o si no existe, aparecerá un mensaje: “Carácter no encontrado”.

• (Texto en mayúsculas).
 */

public class Ejer1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Declaracion de variables
		String texto;
		int longitud;
		int posicioX;
		char caracterPosicion7;
		String textoMayusculas;
		// Pregunatr por el texto

		System.out.println("Introduce un texto: ");
		texto = teclado.nextLine();
		// Calcular la longitud
		longitud = texto.length();
		System.out.println("Longitud de texto introducido  " + longitud + " palabras.");

		// Voy a poner el texto en mayuzculas
		textoMayusculas = texto.toUpperCase();

		// Averiguar el caracte de la posicion 7

		if (longitud >= 7) {
			caracterPosicion7 = texto.charAt(0);
			System.out.println("La posicion del caracter 7 es: " + caracterPosicion7);
		} else {
			System.out.println("El texto es demaciado corto no tiene 7 caracteres: ");
		}
		// Buscar la X Y DAR DOS MENSAJES EN FUNCION DE SI LE encuntra o no O NO
		posicioX = textoMayusculas.indexOf('x');
		if (posicioX > 0) {
			System.out.println("La primera posicion 'x' aparece : " + posicioX);
		} else {
			System.out.println("Carácter no encontrado");

			teclado.close();
		}
	}

}
