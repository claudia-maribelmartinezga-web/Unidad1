package EjerBasica;

import java.util.Scanner;

/*
 *Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información:
 * (cantidad total) de preguntas que se le realizaron y la cantidad de preguntas que (contestó correctamente).
 *  Se pide confeccionar un programa que ingrese los dos datos por teclado e informe
 *   el nivel del mismo según el (porcentaje) de respuestas correctas que ha obtenido, y sabiendo que:

∙Nivel máximo: Porcentaje>=90%.

∙Nivel medio: Porcentaje>=75% y <90%.

∙Nivel regular: Porcentaje>=50% y <75%.

∙Fuera de nivel: Porcentaje<50%.
 */

public class TestCapacitacion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

	
		System.out.print("Ingrese la cantidad total de preguntas: ");
		int totalPreguntas = teclado.nextInt();

		System.out.print("Ingrese la cantidad de preguntas correctas: ");
		int correctas = teclado.nextInt();

		// Cálculo del porcentaje convertimos correctas a double para evitar
		// división entera
		double porcentaje = ((double) correctas / totalPreguntas) * 100;

		System.out.println("Porcentaje obtenido: " + porcentaje + "%");

		//  Estructura condicional encadenada
		if (porcentaje >= 90) {
			System.out.println("Nivel máximo");
		} else if (porcentaje >= 75) {
			System.out.println("Nivel medio");
		} else if (porcentaje >= 50) {
			System.out.println("Nivel regular");
		} else {
			System.out.println("Fuera de nivel");
		}

		teclado.close();
	}
}
