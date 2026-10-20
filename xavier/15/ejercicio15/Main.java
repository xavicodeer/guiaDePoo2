package ejercicio15;

/**
 *
 * @author xavicodeer
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        equiposFutbol equipo1 = new equiposFutbol();
        equiposFutbol equipo2 = new equiposFutbol();
        equiposFutbol equipo3 = new equiposFutbol();

        System.out.println("Datos del primer equipo:");
        System.out.print("Nombre: ");
        equipo1.nombre = teclado.nextLine();
        System.out.print("País: ");
        equipo1.pais = teclado.nextLine();
        System.out.print("Cantidad de jugadores: ");
        equipo1.cantidadJugadores = Integer.parseInt(teclado.nextLine());

        System.out.println("\nDatos del segundo equipo:");
        System.out.print("Nombre: ");
        equipo2.nombre = teclado.nextLine();
        System.out.print("País: ");
        equipo2.pais = teclado.nextLine();
        System.out.print("Cantidad de jugadores: ");
        equipo2.cantidadJugadores = Integer.parseInt(teclado.nextLine());

        System.out.println("\nDatos del tercer equipo:");
        System.out.print("Nombre: ");
        equipo3.nombre = teclado.nextLine();
        System.out.print("País: ");
        equipo3.pais = teclado.nextLine();
        System.out.print("Cantidad de jugadores: ");
        equipo3.cantidadJugadores = Integer.parseInt(teclado.nextLine());

        System.out.println("\nInformación de los equipos:");
        equipo1.mostrarInformacion();
        equipo2.mostrarInformacion();
        equipo3.mostrarInformacion();

        teclado.close();
    }
}