package EjerBasica;

import java.util.Scanner;

/*
 * Pedir una nota por teclado y mostrar un mensaje en pantalla
 *  con la nota en formato texto, en función del rango que se muestra a continuación:

● 1-2: Necesita mejorar

● 3-4: Necesita afianzar

● 5: Suficiente

● 6: Bien

● 7-8: Muy bien

● 9-10: Perfecto

● Resto de opciones: Dato incorrecto.
 */

public class EvaluarNota {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota;
		System.out.println("Ingresar una nota del 1-10: ");
		nota = teclado.nextInt();

		switch (nota) {
		case 1, 2:
			System.out.println("Necesita mejorar: ");
			break;
		case 3, 4:
			System.out.println("Necesita afianzar: ");
			break;
		case 5:
			System.out.println("Suficiente: ");
			break;
		case 6:
			System.out.println("Bien: ");
			break;
		case 7, 8:
			System.out.println("Muy bien: ");
			break;
		case 9, 10:
			System.out.println("Perfecto: ");
			break;
		default:
			System.out.println("Dato incorrecto: ");
		}
	}

}
