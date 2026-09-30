package Nagusia;

import java.util.Scanner;

public class PruebaBisiesto {

	public static void main(String[] args) {
		
		Scanner teklado = new Scanner(System.in);
		int urtea;
		
		// Voy a preguntar al usuario por un año
		// y le voy a decir si ese año es bisiesto o no.
		// Todo esto lo haré dentro de un bucle, para preguntarle más veces por un año, hasta que me diga 9999.
		
		System.out.println("-------------------------");
		System.out.println("CALCULO DE AÑOS BISIESTOS");
		System.out.println("-------------------------");
		
		do {
			// Pregunto el año
			System.out.print("Dame un año (ó 9999 para salir): ");
			urtea = Integer.parseInt( teklado.nextLine());
			
			if( urtea != 9999) {
				// Calculo si es bisiesto
				if( esBisiesto(urtea) == true) {
					System.out.println("El año " + urtea + " es bisiesto.");
				}
				else {
					System.out.println("El año " + urtea + " NO es bisiesto.");
				}
			}
			
			
		} while (urtea != 9999);

		System.out.println("¡Hasta la vuelta!");
		teklado.close();
	}

	
	/**
	 * Calculo del año bisiesto
	 * @param anho -> int
	 * @return -> boolean -> True si es bisiesto. 
	 * 						 False si no lo es
	 */
	private static boolean esBisiesto(int anho) {
		boolean bisiesto = false;
		
		// Calculo si es bisiesto
		if( ((anho % 400) == 0) 
				|| 
			( (( anho % 4) == 0) && (( anho %100 ) != 0)) 
				) {
			bisiesto = true;
		}
		else {
			bisiesto = false;
		}
		
		return bisiesto;
	}
}
