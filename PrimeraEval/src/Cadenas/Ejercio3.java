package Cadenas;

import java.util.Scanner;

/*
 * 3. El programa recibirá un texto y lo mostrará al revés.
 */

public class Ejercio3 {

	public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String textoOriginal;
    String textoInvertido;
    char letraActual;
    //Pedir al usiario que intridusca un texto
        System.out.print("Introduce un texto: ");
        textoOriginal = teclado.nextLine();
        
        
        //Variable donde iremos construyendo texto al reves 
        textoInvertido = " ";
        //Con el bucle for recorremos  el texto introducido por el usuario desde- 1 porque si el texto mide 4
        for(int i = textoOriginal.length() -1; i >= 0; i--) {
       
        	letraActual = textoOriginal.charAt(i);
        	textoInvertido = textoInvertido + letraActual;
        }
        
      //Mostramos el resultado 
      	System.out.println("--- RESULTADO ---");
		System.out.println("Texto original: " + textoOriginal);
		System.out.println("Texto al reves: " + textoInvertido);

        teclado.close();

	}

}
