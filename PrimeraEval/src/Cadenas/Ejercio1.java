package Cadenas;

import java.util.Scanner;

/*
 * 1. El programa leerá un texto y extraerá la siguiente información:

•( Longitud)

• El carácter en la (posición 7).

• La posición donde aparece el primer carácter 'x' o si no existe, aparecerá un mensaje: “Carácter no encontrado”.

• (Texto en mayúsculas).
 */

public class Ejercio1 {

	public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        String texto;
	        int posicionX;
	        System.out.println("Dame un texto: ");
	        texto = teclado.nextLine();
	        
	        // Longitud total que ha ingresado el usuario
	        System.out.println("Longitud: " + texto.length());
	        
	        
	      
	        // Caracter en la posición 7 EL INDICE ES 7 PERO LETRAS SON 8 POR QUE SE CUENATA DESDE 0
	        if (texto.length() > 7) {
	            System.out.println("El caracter en la posición 7: " + texto.charAt(7));
	        } else {
	            System.out.println("El texto es demaciodo corto no tiene 7 caracteres.");
	        }
	        
	        // Buscar la primera 'x'
	        posicionX = texto.indexOf('x');
	        if (posicionX == -1) {
	            System.out.println("Caracter no encontrado.");
	        } else {
	            System.out.println("La 'x' esta en la posicion " + posicionX);
	        }
	        
	        // Convertir el texto en mayuzcula
	        System.out.println("Texto en mayúsculas: " + texto.toUpperCase());
	        
	        teclado.close();
	    }

	}


