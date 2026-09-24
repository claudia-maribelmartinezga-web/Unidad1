package EjerBasica;

import java.util.Scanner;

/*
 * Escribir un programa que lea 10 notas de alumnos
 *  y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 */

public class ContarNotas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
//Declaracion de variables
        int mayorIgualA7 = 0;
        int meyorA7 = 0;
        System.out.println(" ---Registro de 10 notas--- ");
       // usamos un for por que sabemos que con 10 numeros
for(int i = 1; i <= 10; i++) {
	System.out.println("Ingrese una nota del alumno " + i + " es:");
	double nota = teclado.nextDouble();
	
	if(nota >= 7) {
		mayorIgualA7 ++;//le sumamos  1 a la lista se aprovados 
	}else {
		meyorA7 ++;// le sumamos 1 a la lista de menor a 7
	}
	
	
}

// Mostramos los resultados finales
System.out.println("\n--- Resultado del curso ---");
System.out.println("Alumnos con notas mayores o iguales a 7: " + mayorIgualA7);
System.out.println("Alumnos con notas menores a 7: " + meyorA7);

teclado.close();
	}

}
