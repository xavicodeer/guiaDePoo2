package ejercicio14;

/**
 *
 * @author xavicodeer
 */

public class Enfermedades {

    public String nombre;
    public String sintomas;
    public int duracionDias;

    public void mostrarInformacion() {
        System.out.println("La enfermedad " + nombre
                + " presenta los síntomas: " + sintomas
                + " y tiene una duración aproximada de "
                + duracionDias + " días.");
    }
}