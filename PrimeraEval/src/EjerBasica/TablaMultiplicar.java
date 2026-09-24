package EjerBasica;

/*
 * 9. Mostrar la tabla de multiplicar del número 5. Mostrar sólo los 10 primeros valores.
 */

public class TablaMultiplicar {

	public static void main(String[] args) {
		
		int numero = 5;

        System.out.println("Tabla de multiplicar del " + numero + ":");
     
        // El bucle 'for' se ejecutará con i = 1, 2, 3++ hasta 10
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero +  i + " = " + resultado);
        }
        
	}

}
