package UD3;
/*
 *Adaptar el ejercicio anterior para generar 10 números aleatorios
 * y cuente cuántos de ellos son pares y cuántos impares.
 */

import java.util.Scanner;

public class Ejer2 {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {

		
		int contadorPar = 0;
		int contadorImpar = 0;
		System.out.println("-------------------------------------");
		System.out.println(" GENERAR Y CONTAR PARES/IMPARES      ");
		System.out.println("-------------------------------------");
		 System.out.println("Genera 10 numeros aleatorios..");
 for(int i = 0; i < 10 ; i++){
	 
	 int aleatorio = (int)  (Math.random() * 100) + 1; // formula para enteros
	
	 System.out.println("El numero aleatorio " + aleatorio);
	 if(esPar(aleatorio)) {
		 contadorPar++;
	 }else {
		 contadorImpar++;
	 }
 }
 
 System.out.println("n\\n--- RESULTADOS ---");
 System.out.println("Total de numeros pares es: " +contadorPar);
 System.out.println("Total de numeros impares es: " +contadorImpar);
		teclado.close();
	}
	
	private static boolean esPar (int numero) {
		return numero % 2 == 0;
		
		
		
	}

}
