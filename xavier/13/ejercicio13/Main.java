package ejercicio13;

/**
 *
 * @author xavicodeer
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Computadoras computadora1 = new Computadoras();
        Computadoras computadora2 = new Computadoras();
        Computadoras computadora3 = new Computadoras();

        System.out.println("Datos de la primera computadora:");
        System.out.print("Marca: ");
        computadora1.marca = teclado.nextLine();
        System.out.print("Modelo: ");
        computadora1.modelo = teclado.nextLine();
        System.out.print("Precio: $");
        computadora1.precio = Double.parseDouble(teclado.nextLine());

        System.out.println("\nDatos de la segunda computadora:");
        System.out.print("Marca: ");
        computadora2.marca = teclado.nextLine();
        System.out.print("Modelo: ");
        computadora2.modelo = teclado.nextLine();
        System.out.print("Precio: $");
        computadora2.precio = Double.parseDouble(teclado.nextLine());

        System.out.println("\nDatos de la tercera computadora:");
        System.out.print("Marca: ");
        computadora3.marca = teclado.nextLine();
        System.out.print("Modelo: ");
        computadora3.modelo = teclado.nextLine();
        System.out.print("Precio: $");
        computadora3.precio = Double.parseDouble(teclado.nextLine());

        System.out.println("\nInformación de las computadoras:");
        computadora1.mostrarInformacion();
        computadora2.mostrarInformacion();
        computadora3.mostrarInformacion();

        teclado.close();
    }
}