package Cadenas;

import java.util.Scanner;

/*
 * 5. El programa recibirá dos cadenas de caracteres 
 * y nos dirá si son iguales o no.
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena1;
		String cadena2;

		// Pedir al usiario que intridusca un cadena de carracteres
		System.out.print("Primera cadena: ");
		cadena1 = teclado.nextLine();

		System.out.print("Segunda cadena: ");
		cadena2 = teclado.nextLine();

		// Usamos el metodo equals para comparar el texto introducido
		if (cadena1.equals(cadena2)) {
			System.out.print("Las cadenas son iguales. ");

		} else {
			System.out.print("Las cadenas no son iguales. ");
		}
		teclado.close();
	}

}
