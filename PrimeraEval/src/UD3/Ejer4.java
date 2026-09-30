package UD3;

/*
 * Diseña un método esPrimo() que reciba como parámetro un entero
 *  y devuelva si ese número es primo o no.
 *   Utilízalo en un programa que solicite un número, N, 
 * y genere los N primeros números primos.
 */
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println(" GENERADOR DE N PRIMEROS NÚMEROS     ");
		System.out.println("-------------------------------------");

		System.out.print("¿Cuántos números primos quieres generar (N)?: ");
		int n = Integer.parseInt(teclado.nextLine());

		System.out.println("\nLos primeros " + n + " números primos son:");
		
		int contadorPrimosEncontrados = 0;
		int candidato = 2; // Primer número a probar

		while (contadorPrimosEncontrados < n) {
			if (esPrimo(candidato)) {
				System.out.print( "Numero primes es  " +candidato + " ");
				contadorPrimosEncontrados++;
			}
			candidato++;
		}
		System.out.println();

		teclado.close();
	}

	/**
	 * Determina si un número es primo.
	 */
	private static boolean esPrimo(int numero) {
		if (numero <= 1) {
			
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				
			}
		}
		return true;
	}
	}


