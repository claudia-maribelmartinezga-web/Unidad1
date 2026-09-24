package EjerBasica;

import java.util.Scanner;

/*
 * Pedir la edad por teclado y decir si es mayor de edad o no.
 */
public class MayorEdad {

	public static void main(String[] args) {
		   Scanner teclado = new Scanner(System.in);
		  int edad;
		   System.out.println("Ingresar tu edad: ");
	        edad = teclado.nextInt();
	        if(edad >= 18){
	        	  System.out.println("Eres mayor de edad: " + edad);
	        }else {
	        	  System.out.println("Eres menor de edad: " + edad);
	        }
teclado.close();
	}

}
