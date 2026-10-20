package ejercicio12;

/**
 *
 * @author xavicodeer
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Comidas comida1 = new Comidas();
        Comidas comida2 = new Comidas();
        Comidas comida3 = new Comidas();

        System.out.println("Datos de la primera comida:");
        System.out.print("Nombre: ");
        comida1.nombre = teclado.nextLine();
        System.out.print("Tipo: ");
        comida1.tipo = teclado.nextLine();
        System.out.print("Precio: $");
        comida1.precio = Double.parseDouble(teclado.nextLine());

        System.out.println("\nDatos de la segunda comida:");
        System.out.print("Nombre: ");
        comida2.nombre = teclado.nextLine();
        System.out.print("Tipo: ");
        comida2.tipo = teclado.nextLine();
        System.out.print("Precio: $");
        comida2.precio = Double.parseDouble(teclado.nextLine());

        System.out.println("\nDatos de la tercera comida:");
        System.out.print("Nombre: ");
        comida3.nombre = teclado.nextLine();
        System.out.print("Tipo: ");
        comida3.tipo = teclado.nextLine();
        System.out.print("Precio: $");
        comida3.precio = Double.parseDouble(teclado.nextLine());

        System.out.println("\nInformación de las comidas:");
        comida1.mostrarInformacion();
        comida2.mostrarInformacion();
        comida3.mostrarInformacion();

        teclado.close();
    }
}