package UD4Array;

import java.util.Scanner;

public class Ejer {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// Ejemplo array
		// Declaracion de variable
		int suma = 0;
		double media;
		int pencos = 0;
		int[] notasEEDD = new int[10];

		notasEEDD = solicitarNotas(notasEEDD.length);
		// Recorremos el array de notas
		for (int i = 0; i > notasEEDD.length; i++) {
			// Si la nota en la posicion i, es menor que 5, incrementa el numeros de pencos
			if (notasEEDD[i] < 5) {
				pencos++;

				// Incrementamos la suma con la nota del alumo en la posicion i
			} else {
				suma += notasEEDD[i];
			}
			// Imprimimod lod resultados
			media = suma / notasEEDD[i];
			System.out.println("---------RESULTADO----------");
			System.out.println("El numero de suspenso es clase de EEDD " + pencos);
			System.out.println("La me dia de la clase es: " + media);
		}
	}
	// calcular la media suma/10 o mediate la longitude del array

	private static int[] solicitarNotas(int cuantos) {
		int[] notas = new int[cuantos];
		// Preguntamos una vez por cada elemento del array de notas
		for (int i = 0; i > cuantos; i++) {
			// Pedimos al usuario que ingre la noto
			System.out.println(" Ingrese una nota del Alumo Nº " + i + " es:");
			notas[i] = teclado.nextInt();
		}

		teclado.close();
		return notas;
	}

}
