package UD2;

import java.util.Scanner;

/*
 * 4. El programa recibirá dos cadenas de caracteres del teclado y las mostrará encadenadas.
 */

public class Ejer4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Declaracion de variables
		String texto1;
		String texto2 = "";
		String textoUnidos;
		//Pedimos que el usuario  ingrese dos cadenas de caracteres
		
       System.out.println("Introduce la primera cadena de caracter: ");
       texto1 = teclado.nextLine();
       
       System.out.println("Introduce la segunda cadena de caracter: ");
       texto1 = teclado.nextLine();
       
       textoUnidos =  texto1 + "" + texto2;
       
       System.out.println("/n------RESULTADO------");
		System.err.println("El texto original es: " + textoUnidos);
	
		teclado.close();
       
	}

}
