package UD2;
/*
 * 5. El programa recibirá dos cadenas de caracteres y nos dirá si son iguales o no.
 */

import java.util.Scanner;

public class CompararCadenas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// declaracion de variables
		String texto1;
		String texto2;
		// Pedimos la primera cadena se texto
				System.out.println("Ingresa el primer texto: ");
				texto1 = teclado.nextLine();
				// Pedimos la segundo cadena se texto
				System.out.println("Ingresa el segundo texto: ");
				texto2 = teclado.nextLine();
				System.out.println("--- RESULTADO ---");
				// Comparamos si el texto introducido por el usuario son exactamente iguales con .equals
				if (texto1.equals(texto2)) {
					System.out.println("El texto introducido son exactamente iguales: ");
				}else {
					System.out.println("El texto introducido no son iguales: ");
				}
				
				teclado.close();
	}

}
