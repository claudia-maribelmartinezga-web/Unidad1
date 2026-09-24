package EjerBasica;

import java.util.Scanner;

/*
 * . Ingresar el sueldo de una persona, si supera los 3000 euros
 *  mostrar un mensaje en pantalla indicando que debe abonar impuestos.
 */

public class CalcularSueldo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double sueldo;
		System.out.println("Ingresar el sueldo de una persona: ");
		sueldo = teclado.nextDouble();

		if (sueldo > 3000) {
			System.out.println("Debe abonar impuesto: " + sueldo);
		} else {
			System.out.println("No debe abonar impuesto: " + sueldo);
		}
		teclado.close();
	}

}
