package UD3;

import java.util.Scanner;



/*
 * Diseña un método esMayor() que reciba como parámetro dos enteros
 *  y devuelva el mayor de los dos. 
 *  Utilízalo en un programa que lea dos números por teclado y
 *   determine cuál de ellos es el mayor.
 */

public class Ejer3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	int num1;
	int num2;
	int mayor;
		
		System.out.println("-------------------------");
		System.out.println("   BUSCADOR DEL MAYOR    ");
		System.out.println("-------------------------");
		// Pedimos la primera cadena se texto
		System.out.println("Ingresa el primer : ");
		 num1 =  Integer.parseInt(teclado.nextLine());
		// Pedimos la segundo cadena se texto
		System.out.println("Ingresa el segundo numero: ");
		 num2 =  Integer.parseInt(teclado.nextLine());
		
		 if(num1 == num2) {
			 System.out.println("Los dos numeros son iguales " + num1 +".");
		 }else {
			 mayor = esMayor(num1, num2);
			 System.out.println("El numero mayor es: " + mayor);
		 }

        teclado.close();
	}
	
	/**
	 * Devuelve el mayor de dos enteros.
	 * @param num1 -> int
	 * @param num2 -> int
	 * @return -> int (el número con mayor valor)
	 */
	
	private static int esMayor(int num1,  int num2) {
		return num2;
		
		
	}

}
