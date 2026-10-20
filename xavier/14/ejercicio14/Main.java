package ejercicio14;

/**
 *
 * @author xavicodeer
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Enfermedades enfermedad1 = new Enfermedades();
        Enfermedades enfermedad2 = new Enfermedades();
        Enfermedades enfermedad3 = new Enfermedades();

        System.out.println("Datos de la primera enfermedad:");
        System.out.print("Nombre: ");
        enfermedad1.nombre = teclado.nextLine();
        System.out.print("Síntomas: ");
        enfermedad1.sintomas = teclado.nextLine();
        System.out.print("Duración aproximada en días: ");
        enfermedad1.duracionDias = Integer.parseInt(teclado.nextLine());

        System.out.println("\nDatos de la segunda enfermedad:");
        System.out.print("Nombre: ");
        enfermedad2.nombre = teclado.nextLine();
        System.out.print("Síntomas: ");
        enfermedad2.sintomas = teclado.nextLine();
        System.out.print("Duración aproximada en días: ");
        enfermedad2.duracionDias = Integer.parseInt(teclado.nextLine());

        System.out.println("\nDatos de la tercera enfermedad:");
        System.out.print("Nombre: ");
        enfermedad3.nombre = teclado.nextLine();
        System.out.print("Síntomas: ");
        enfermedad3.sintomas = teclado.nextLine();
        System.out.print("Duración aproximada en días: ");
        enfermedad3.duracionDias = Integer.parseInt(teclado.nextLine());

        System.out.println("\nInformación de las enfermedades:");
        enfermedad1.mostrarInformacion();
        enfermedad2.mostrarInformacion();
        enfermedad3.mostrarInformacion();

        teclado.close();
    }
}