package EjerBasica;



import java.util.Scanner;

/*
 * 15. Realizar un programa que implemente cuatro operaciones básicas de una calculadora: suma, resta, producto y división.

Mostrar en pantalla el siguiente menú:

*****************

Calculadora

*****************

1. Suma

2. Resta

3. Producto

4. División

5. Salir

Introduce la opción deseada:

En función de la opción introducida por el usuario, se realizará lo siguiente:

a. Opciones entre 1 y 4: en todos ellos se solicitará introducir dos números por teclado y se realizará la operación matemática indicada por el número de opción de menú.
 En pantalla se mostrará lo siguiente:

Operación seleccionada: nombre operación en texto

Operando1 operación Operando2 = resultado

Ejemplo:

Operación seleccionada: Suma

5+1=6

b. Hasta que se pulse el número 5,
 la calculadora estará ejecutándose constantemente. 
 Una vez realizada una operación,
  el menú volverá a mostrarse para que el usuario pueda seleccionar una nueva opción.

c. Si selecciona la opción 5,
 el programa terminará.

d. Si se pulsa un número fuera del rango del 1 al 5,
 se mostrará un mensaje por pantalla: 
 Opción X no disponible, vuelva a intentarlo. 
 A continuación, volver a mostrar el menú para que pueda continuar.



 */

public class Calculadora { 
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 
        int opcion; 
        
        do { 
            // Mostrar menú al usuario 
            System.out.println("***************** Calculadora *****************"); 
            System.out.println("1. Suma"); 
            System.out.println("2. Resta"); 
            System.out.println("3. Producto"); 
            System.out.println("4. División"); 
            System.out.println("5. Salir"); 
            System.out.print("Introduce la opción deseada: "); 
            opcion = teclado.nextInt(); 
            
            if (opcion == 5) { 
                // Opción de salida 
                System.out.println("Programa terminado. ¡Hasta luego!"); 
            } // <- Faltaba cerrar esta llave para el 'if'
            else if (opcion >= 1 && opcion <= 4) { 
                System.out.print("Introduce el primer número: "); 
                double operando1 = teclado.nextDouble(); 
                System.out.print("Introduce el segundo número: "); 
                double operando2 = teclado.nextDouble(); 
                
                // Las variables deben declararse antes de usarse
                String nombreOperacion = "";
                char signo = ' ';
                double resultado = 0;
                boolean operacionValida = true;

                // Determinar la operación usando switch 
                switch (opcion) { 
                    case 1: 
                        nombreOperacion = "Suma"; // <- Faltaba la variable 'nombreOperacion'
                        signo = '+'; 
                        resultado = operando1 + operando2; 
                        break; 
                    case 2: 
                        nombreOperacion = "Resta"; 
                        signo = '-'; 
                        resultado = operando1 - operando2; 
                        break; 
                    case 3: 
                        nombreOperacion = "Producto"; 
                        signo = '*'; 
                        resultado = operando1 * operando2; 
                        break; 
                    case 4: 
                        nombreOperacion = "División"; 
                        signo = '/'; 
                        // Controlar la división por cero 
                        if (operando2 == 0) { 
                            System.out.println("Error: No se puede dividir entre cero.\n"); 
                            operacionValida = false; 
                        } else { 
                            resultado = operando1 / operando2; 
                        } 
                        break; 
                } 

                // Mostrar el resultado solo si la operación fue válida 
                if (operacionValida) { 
                    System.out.println("Operación seleccionada: " + nombreOperacion); 
                    System.out.println(operando1 + " " + signo + " " + operando2 + " = " + resultado); 
                    System.out.println(); // Salto de línea 
                } 
            } else {
                // Controlar que el usuario no introduzca una opción inválida (ej. 6)
                System.out.println("Opción no válida. Inténtalo de nuevo.\n");
            }
        } while (opcion != 5); 
        
        teclado.close(); 
    } 
}

