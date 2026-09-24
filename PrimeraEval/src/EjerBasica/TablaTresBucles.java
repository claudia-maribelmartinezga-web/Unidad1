package EjerBasica;

import java.util.Scanner;

public class TablaTresBucles {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numeno para ver la tabla de multiplicar: ");
	 int numero = teclado.nextInt();
for (int i = 1; i <= 10; i++) {
	System.out.println(numero + " x " + i + " = " + numero * i);

}

//bucle while
int j = 1;
while(j <= 10) {
	System.out.println(numero + " x " + j + " = " + numero * j);
	j++;
}
// do while
int k = 1; // 1. Inicialización
do {
    System.out.println(numero + " x " + k + " = " + (numero * k));
    k++;
}while(k <= 10); {
	
}
	}

}
