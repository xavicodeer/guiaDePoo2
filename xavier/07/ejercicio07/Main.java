package ejercicio07;

/**
 *
 * @author xavicodeer
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Lagos lago1 = new Lagos();
        Lagos lago2 = new Lagos();
        Lagos lago3 = new Lagos();

        System.out.println("Datos del primer lago:");
        System.out.print("Nombre: ");
        lago1.nombre = teclado.nextLine();
        System.out.print("Ubicación: ");
        lago1.ubicacion = teclado.nextLine();
        System.out.print("Extensión en km²: ");
        lago1.extensionKm2 = Double.parseDouble(teclado.nextLine());

        System.out.println("\nDatos del segundo lago:");
        System.out.print("Nombre: ");
        lago2.nombre = teclado.nextLine();
        System.out.print("Ubicación: ");
        lago2.ubicacion = teclado.nextLine();
        System.out.print("Extensión en km²: ");
        lago2.extensionKm2 = Double.parseDouble(teclado.nextLine());

        System.out.println("\nDatos del tercer lago:");
        System.out.print("Nombre: ");
        lago3.nombre = teclado.nextLine();
        System.out.print("Ubicación: ");
        lago3.ubicacion = teclado.nextLine();
        System.out.print("Extensión en km²: ");
        lago3.extensionKm2 = Double.parseDouble(teclado.nextLine());

        System.out.println("\nInformación de los lagos:");
        lago1.mostrarInformacion();
        lago2.mostrarInformacion();
        lago3.mostrarInformacion();

        teclado.close();
    }
}