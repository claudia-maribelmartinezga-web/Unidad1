package PreReto;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double saldo = 1000.0;
		int opcion = 0;
		do {
			System.out.println("------SIMULADOR DE CAJERO AUTOMATICO-----");
			System.out.println("1- Consultar saldo");
			System.out.println("2- Ingresar saldo");
			System.out.println("3- Retirar saldo");
			System.out.println("4- Salir");

			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Su saldo actual es: " + saldo + "€");
				break;
			case 2:
				System.out.println("Ingrese la contidad a depositar: ");
				double ingreso = teclado.nextDouble();
				if (saldo > 0) {
					saldo = saldo + ingreso;
					System.out.println("Ingreso realizado correctamente" + saldo + "€");
				} else {
					System.out.println("La cantidad ingresada debe ser mayor a 0€");
				}
				break;
			case 3:
				System.out.println("Ingreso cantidad a retitar: ");
				 double retiro = teclado.nextDouble();
				if (retiro <= 0) {
					System.out.println("La cantidad retirada debe ser mayor a 0€" + saldo + "euros");
				} else if (retiro > saldo){
					System.out.println("Error fonfo insuficiente. Su saldo disponible es  " + saldo + "€");
				}else {
					saldo = saldo - retiro; // Equivalente a: saldo -= retiro
                    System.out.println("Retiro exitoso. Nuevo saldo: " + saldo + "€");
                
				}
				break;
			case 4:
				System.out.println("Gracia por utitizar nuetrso cajeros.  Hasta pronto!" + saldo + "euros");
				break;
				default:
					System.out.println("Opción no válida. Por favor, elija un número del 1 al 4.");
                    break;	
			}
		} while (opcion != 4);
		{
			teclado.close();
		}

	}

}
