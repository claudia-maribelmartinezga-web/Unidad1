package UD3;
/*
 * Diseña un método esPar() que reciba como parámetro un entero y 
 * devuelva si ese número es par o no.
 *  Utilízalo en un programa que lea un número por teclado y
 *   determine si es par o no.
 */

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero ;
			
		System.out.println("-------------------------");
		System.out.println("   COMPROBADOR DE PAR    ");
		System.out.println("-------------------------");
		
		// Pedimos al unuario wue introdusca un numero entero y lo guardamos 
		System.out.println("Introduce un numero entero: ");
	 numero = Integer.parseInt(teclado.nextLine());
		 //Comparamos el numero que ha metido el usuario
		
		if(esPar(numero)) {
			System.out.println("El numero " + numero + " es Par:");
			
		}else {
			System.out.println("El numero " + numero + " es Impar:");
		}
		
		teclado.close();
	}

	/**
	 * Determina si un número es par.
	 * @param numero -> int
	 * @return -> (boolean true si es par, false si no)
	 */
	private static boolean esPar(int numero) {
		
		return numero % 2 == 0;
	}

}
