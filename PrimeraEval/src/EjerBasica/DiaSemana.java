package EjerBasica;

import java.util.Scanner;

/*
 * Leer por pantalla un número del 1 al 7 y mostrar por pantalla el día de la semana correspondiente.
 */

public class DiaSemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia;
		System.out.println("Ingrese un numero del 1 al 7: ");
		dia = teclado.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Lunes: ");
			break;
		case 2:
			System.out.println("Martes: ");
			break;
		case 3:
			System.out.println("Miercoles: ");
			break;
		case 4:
			System.out.println("Jueves: ");
			break;
		case 5:
			System.out.println("viernes: ");
			break;
		case 6:
			System.out.println("Sabado: ");
			break;
		case 7:
			System.out.println("Domingo: ");
			break;
		default:
			System.out.println("Dato incorrecto el numero debe estar del 1 al 7: ");
		}
teclado.close();
	}

}
