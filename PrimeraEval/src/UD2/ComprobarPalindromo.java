package UD2;

import java.util.Scanner;

/*
 * 6. El programa recibirá un texto y nos dirá si es un palíndromo.
 */
public class ComprobarPalindromo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// declaracion de variables
		String textoOriginal;
		String textoLimpio;
		String textoInvertido;
		// pedimos el primer texto
				System.out.println("Ingresa un texto para saber si es palíndromo: ");
				textoOriginal = teclado.nextLine();// guardamos lo que ha ingresado el usuario
				//limpiamos el texto quitamos espacios con replace y convertimos a minúsculas con .toLowerCase
		        // texto.replace(" ", ""): Este método actúa como una aspiradora. Le dices: "Busca todos los espacios en blanco (" ") y reemplázalos por un texto vacío ("")".
				textoLimpio = textoOriginal.replace("", "").toLowerCase();
                textoInvertido = "";//he creado una versión invertida del texto limpio
                
                for(int i = textoLimpio.length() - 1; i >= 0 ; i--) {
                	textoInvertido =  textoInvertido + textoLimpio.charAt(i);// tomamos cado posicion del i y lo huatdamos en textoInvertido
                }
                
                System.out.println(" --- RESULTADO --- ");
                System.out.println("Texto limpio: " + textoLimpio);
                System.out.println("Texto invertido: " + textoInvertido);

                // comparamos las dos versiones si son exactamente iguales
                if (textoLimpio.equals(textoInvertido)) {
                    System.out.println("¡Es un palíndromo!");
                } else {
                    System.out.println("No es un palíndromo.");
                }

                teclado.close();
	}

}
