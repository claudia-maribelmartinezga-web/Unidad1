package EjerBasica;

import java.util.Scanner;

/*
 * Desarrollar un programa que permita cargar n números enteros
 *  y luego nos informe cuántos valores fueron pares y cuántos impares.
 *  Solicitar antes el número de enteros a tratar.
 */

public class ContarParesImpares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Cuantos numeros desea ingresar?: ");
		int n = teclado.nextInt();
		
		int pares =0;
		int impares = 0;
		//Bucle para pedir los N números
		for(int i = 1; i <= n; i++) {
			System.out.println("Ingrese el numero " + i + ": ");
			int numero = teclado.nextInt();
			//Evaluamos la paridad usando el módulo (%)
			if (numero  % 2 == 0) {
				pares++;
				System.out.println("Cantidad de números pares: " + pares);
			}else {
				System.out.println("Cantidad de números impares: " + impares);
				impares++;
			}
			teclado.close();
		}
		

	}

}
