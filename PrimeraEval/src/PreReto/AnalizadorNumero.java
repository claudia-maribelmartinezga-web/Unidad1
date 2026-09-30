package PreReto;

import java.util.Scanner;

public class AnalizadorNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
  int suma = 0;
  int pares = 0;
  int impares = 0;
  int primos = 0;
  int mayor = 0;
  int menor = 0;
  System.out.println("-----INTRODUZCA 10 NÚMEROS ENTEROS----");
  
  for(int i = 0; i <= 10; i++) {
	  System.out.println("Numero " + i+ ": ");
	  int num = teclado.nextInt();
	// En la primera iteración, inicializamos mayor y menor con el primer número ingresado
     if(i == 1) {
    	 mayor = num;
    	 menor = num;
     }else {
    	// En las siguientes iteraciones, comparamos
    	 if(num > num) {
    		 mayor = num;
    	 } if(num < menor) {
    		 menor = num;
    		 
    	 }
     }
     //  Acumular la suma 
         suma = suma + num;

      // Determinar par o impar
         if(num % 2 == 0) {
        	 pares ++;
         }else {
        	 impares++;
         }
   // Determinar si es primo
         
         if(esPrimo(num)) {
        	 primos++;
        	 
         }
  }
  
  double promedio = suma / 10;  
  
  
  
//Paso F: Mostrar resultados
  System.out.println("\n=== RESULTADOS DEL ANÁLISIS ===");
  System.out.println("Suma total: " + suma);
  System.out.println("Promedio: " + promedio);
  System.out.println("Número mayor: " + mayor);
  System.out.println("Número menor: " + menor);
  System.out.println("Cantidad de números pares: " + pares);
  System.out.println("Cantidad de números impares: " + impares);
  System.out.println("Cantidad de números primos: " + primos);

  teclado.close();
}

// Función auxiliar para comprobar si un número es primo
public static boolean esPrimo(int n) {
 // Números menores o iguales a 1 no son primos
  
  // Si tiene algún divisor, no es primo
  
  return true; // Si no encontró divisores, es primo
}
	}




