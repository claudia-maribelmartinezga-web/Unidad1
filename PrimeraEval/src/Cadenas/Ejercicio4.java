package Cadenas;

import java.util.Scanner;

/*
 * 4. El programa recibirá dos cadenas de caracteres 
 * del teclado y las mostrará encadenadas.
 */

public class Ejercicio4 {

	public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String texto1;
    String texto2;
    String resultado;
     //Pedir al usiario que intridusca un texto 
        System.out.print("Primera cadena: ");
        texto1 = teclado.nextLine();
        
        System.out.print("Segunda cadena: ");
        texto2 = teclado.nextLine();
        
        // Usamos el método.concat de la clase String
        resultado = texto1.concat(texto2);
         //resultado = texto1 + texto2;
         
     	System.out.println("--- RESULTADO ---");
        System.out.println("Resultado encadenado: " + resultado);
        
        teclado.close();
	}

}
