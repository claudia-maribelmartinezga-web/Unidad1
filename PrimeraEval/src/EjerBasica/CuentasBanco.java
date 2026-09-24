package EjerBasica;

import java.util.Scanner;

/*
 * En un banco se procesan datos de las cuentas corrientes de sus clientes. 
 * De cada cuenta corriente se conoce: (número de cuenta )y( saldo actual).
 *  El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.

Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:

a)De cada cuenta:( número de cuenta )y
 estado de la cuenta según su saldo, sabiendo que 
 Estado de la cuenta puede tener los siguientes valores:

'Acreedor' si el saldo es >0.

● 'Deudor' si el saldo es <0.

● 'Nulo' si el saldo es =0.

b) La suma total de los (saldos acreedores).
 */


public class CuentasBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double sumaAcreedores = 0;

        // PediR el primer número de cuenta 
        System.out.print("Ingresa el número de cuenta (negativo para salir): ");
        int numeroCuenta = teclado.nextInt();

        //  MIENTRAS el número de cuenta no sea negativo SE REPITE LA CONDICION 
        while (numeroCuenta >= 0) {

            // Pedir el saldo actual
            System.out.print("Ingresa el saldo de la cuenta: ");
            double saldo = teclado.nextDouble();

            // Evaluar estaado de la cuenta
            if (saldo > 0) {
                System.out.println("Cuenta " + numeroCuenta + " Estado: Acreedor");
                sumaAcreedores = sumaAcreedores + saldo; // Acumulamos el saldo
            } else if (saldo < 0) {
                System.out.println("Cuenta " + numeroCuenta + " Estado: Deudor");
            } else {
                System.out.println("Cuenta " + numeroCuenta + " Estado: Nulo");
            }

            System.out.println("----------------------------------------------");

            // Pedir el SIGUIENTE número de cuenta para la próxima repetición
            System.out.print("Ingresa el número de cuenta negatico para salir : ");
            numeroCuenta = teclado.nextInt();
        }

        // cuando se ingresa un numero negatico se termina el bucle
        System.out.println("\n==================================");
        System.out.println("Suma total de saldos acreedores: " + sumaAcreedores);
        System.out.println("==================================");

        teclado.close();
    }
}


