package ejercicio20;

/**
 *
 * @author xavicodeer
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Carreras ingenieriaSistemas = new Carreras();
        Carreras administracionEmpresas = new Carreras();
        Carreras medicina = new Carreras();
        Carreras derecho = new Carreras();

        System.out.println("Datos de Ingeniería en Sistemas:");
        System.out.print("Facultad: ");
        ingenieriaSistemas.facultad = teclado.nextLine();
        System.out.print("Duración en años: ");
        ingenieriaSistemas.duracionAnios = Integer.parseInt(teclado.nextLine());

        System.out.println("\nDatos de Administración de Empresas:");
        System.out.print("Facultad: ");
        administracionEmpresas.facultad = teclado.nextLine();
        System.out.print("Duración en años: ");
        administracionEmpresas.duracionAnios = Integer.parseInt(teclado.nextLine());

        System.out.println("\nDatos de Medicina:");
        System.out.print("Facultad: ");
        medicina.facultad = teclado.nextLine();
        System.out.print("Duración en años: ");
        medicina.duracionAnios = Integer.parseInt(teclado.nextLine());

        System.out.println("\nDatos de Derecho:");
        System.out.print("Facultad: ");
        derecho.facultad = teclado.nextLine();
        System.out.print("Duración en años: ");
        derecho.duracionAnios = Integer.parseInt(teclado.nextLine());

        System.out.println("\nInformación de las carreras:");

        System.out.print("Ingeniería en Sistemas - ");
        ingenieriaSistemas.mostrarInformacion();

        System.out.print("Administración de Empresas - ");
        administracionEmpresas.mostrarInformacion();

        System.out.print("Medicina - ");
        medicina.mostrarInformacion();

        System.out.print("Derecho - ");
        derecho.mostrarInformacion();

        teclado.close();
    }
}