package UD2;

import java.util.Scanner;

/*
 * 2. El programa recibirá un (texto) y mostrará (cuántas veces = contador)aparece la( letra= letraActual 'a').

 */

public class ºEjer2 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		// Declaracion de variables
	String texto;
	int contador;
	String textoMinusculas;
    char letraActual;
    
    //Pedimos al usuario que introduzca un texto
	System.out.println("Escribe un texto: ");
	texto = teclado.nextLine();
	contador = 0;
	//Pasamos el texto introducido a mayusculas
	textoMinusculas = texto.toLowerCase(); 
	
	for(int i = 0; i < textoMinusculas.length(); i++) {
		letraActual = textoMinusculas.charAt(i);
		
		if(letraActual ==  'a') {
			contador++;
		
		System.out.println("La letra 'a' aparece " + contador + "veces.");
	
	}
	}

}}

