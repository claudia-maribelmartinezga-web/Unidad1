package UD2;

import java.util.Scanner;

/*
 * 4. El programa recibirá dos cadenas de caracteres del teclado y las mostrará encadenadas.
 */

public class EncadenarTexto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// declaracion de variables
		String texto1;
		String texto2;
		String textoUnido;
		// Pedimos la primera cadena se texto
		System.out.println("Ingresa el primer texto: ");
		texto1 = teclado.nextLine();
		// Pedimos la segundo cadena se texto
		System.out.println("Ingresa el segundo texto: ");
		texto2 = teclado.nextLine();
		// Encadenamos los dos cadenas de caracteres concatenamos
		//
		// textoUnido = texto1.concat(" ").concat(texto2); se puede usar la variable concat tambien para concatenar 
		//Mostramos el resultado por pantalla
        System.out.println("--- RESULTADO ENCADENADO ---");
        //System.out.println(textoUnido);

        teclado.close();
	}

}
