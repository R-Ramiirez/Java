package desafios;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1500.99;
        int opcion = 0;

        System.out.println("*******************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo es: $" + saldo);
        System.out.println("\n*****************************************");

        String menu = """
                *** Escribe el numero de la opcion ***
                1 - Cosultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: $" + saldo);
                    break;

                case 2:
                    System.out.println("Monto que desea retirar");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("Nuevo saldo $" + saldo);
                    }
                    break;

                case 3:
                    System.out.println("Monto que desea depositar");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("Nuevo saldo actualizado $" + saldo);
                    break;

                case 9:
                    System.out.println("Saliendo del sistema, gracias por la prueba");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
