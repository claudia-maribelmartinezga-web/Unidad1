package EjerBasica;

import java.util.Scanner;

/*
 *  Realizar un programa que implemente cuatro operaciones básicas de una calculadora: suma, resta, producto y división. Mostrar en pantalla el siguiente menú:

*****************

Calculadora

*****************

Introduce en número 1:

Introduce el número 2:

Introduce la opción deseada:

1. Suma

2. Resta

3. Producto

4. División

5. Salir

Introduce la opción deseada:

El programa mostrará la operación y su resultado: Ejemplo 3+4=7
 */

public class CalculadoraMenu {

		    public static void main(String[] args) {
		        Scanner teclado = new Scanner(System.in);
		        int opcion;

		       
		            System.out.println("*****************");
		            System.out.println("Calculadora");
		            System.out.println("*****************");

		            System.out.print("Introduce en número 1: ");
		            double num1 = teclado.nextDouble();

		            System.out.print("Introduce el número 2: ");
		            double num2 = teclado.nextDouble();

		            System.out.println("Introduce la opción deseada:");
		            System.out.println("1. Suma");
		            System.out.println("2. Resta");
		            System.out.println("3. Producto");
		            System.out.println("4. División");
		            System.out.println("5. Salir");
		            System.out.print("Introduce la opción deseada: ");
		            opcion = teclado.nextInt();

					int resul = 0;

		            switch (opcion) {
		                case 1 :
		                	System.out.println(num1 + " + " + num2 + " = " + resul);
		                	break;
		                case 2 :
		                	System.out.println(num1 + " - " + num2 + " = " + resul );
		                	break;
		                case 3 :
		                	System.out.println(num1 + " * " + num2 + " = " + resul);
		                	break;
		                case 4 :
		                System.out.println(num1 + " / " + num2 + " = " + resul);
		                break;
		                default:
		                        System.out.println("Opción no válida, intente de nuevo.");
		                    }
		

		    

		        teclado.close();
		    }
	}

