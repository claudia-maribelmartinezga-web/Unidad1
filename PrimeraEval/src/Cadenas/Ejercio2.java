
package Cadenas;

import java.util.Scanner;

/**
 * 2. El programa recibirá un texto y
 *  mostrará cuántas veces aparece la letra 'a'.
 */
public class Ejercio2 {

	public static void main(String[] args) {
		
       Scanner teclado = new Scanner(System.in);
        String texto; 
        int contador;
        char letra ;
        
        System.out.print("Introduce un texto: ");
        texto = teclado.nextLine().toLowerCase(); // Lo pasamos a minúsculas 
        
        contador = 0;
        
        // Recorrer con un for caracteres  por caracter 
        for (int i = 0; i < texto.length(); i++) {
			// Extraer la letra en la posicion'i'
			letra = texto.charAt(i);
			//Comparar si letra es igual  'a'
            if (letra == 'a') { 
            	//si es asi lo vamos ingrementando
                contador++;
            }
        }
        System.out.println("--- RESULTADO ---");
        System.out.println("La letra 'a' aparece " + contador + " veces.");
        
        teclado.close();
    }
	}


