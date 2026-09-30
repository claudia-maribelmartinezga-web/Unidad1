package PreReto;

import java.util.Scanner;

public class NúmerosPerfectosAmigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        int n = 0;

        // Validación de entrada para asegurar que N sea positivo
        do {
            System.out.print("Introduce un número entero positivo N: ");
            if (teclado.hasNextInt()) {
                n = teclado.nextInt();
                if (n <= 0) {
                    System.out.println("El número debe ser mayor que 0.");
                }
            } else {
                System.out.println("Entrada no válida. Debe ser un número entero.");
                teclado.next(); // Limpiar entrada incorrecta
            }
        } while (n <= 0);

        // --- 1. NÚMEROS PERFECTOS ---
        System.out.println("\n=== NÚMEROS PERFECTOS MENORES QUE " + n + " ===");
        boolean encontradoPerfecto = false;

        for (int i = 1; i < n; i++) {
            if (sumaDivisores(i) == i) {
                System.out.println("- " + i + " es un número perfecto.");
                encontradoPerfecto = true;
            }
        }

        if (!encontradoPerfecto) {
            System.out.println("No se encontraron números perfectos menores que " + n + ".");
        }

        // --- 2. NÚMEROS AMIGOS ---
        System.out.println("\n=== PAREJAS DE NÚMEROS AMIGOS MENORES QUE " + n + " ===");
        boolean encontradoAmigos = false;

        for (int a = 1; a < n; a++) {
            int b = sumaDivisores(a);

            // Validaciones para evitar duplicados y asegurar a < b < n
            if (a < b && b < n) {
                if (sumaDivisores(b) == a) {
                    System.out.println("- " + a + " y " + b + " son números amigos.");
                    encontradoAmigos = true;
                }
            }
        }

        if (!encontradoAmigos) {
            System.out.println("No se encontraron parejas de números amigos menores que " + n + ".");
        }

       teclado.close();
    }

    /**
     * Método auxiliar que calcula la suma de los divisores propios de un número.
     * @param num Número entero a evaluar.
     * @return Suma de sus divisores propios (excluyéndose a sí mismo).
     */
    public static int sumaDivisores(int num) {
        int suma = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
	}


