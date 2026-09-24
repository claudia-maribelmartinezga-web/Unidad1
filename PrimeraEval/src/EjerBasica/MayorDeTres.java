package EjerBasica;

/*
 * Pedir tres números por teclado y 
 * mostrar en pantalla el mayor de los tres.
 */

import java.util.Scanner;

public class MayorDeTres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = teclado.nextInt();

        // Asumimos que el primero es el mayor
        int mayor = num1;

        // Comparamos secuencialmente
        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);

        teclado.close();
    }
}