package ejercicio15;

/**
 *
 * @author xavicodeer
 */

public class equiposFutbol {

    public String nombre;
    public String pais;
    public int cantidadJugadores;

    public void mostrarInformacion() {
        System.out.println("El equipo " + nombre
                + " es de " + pais
                + " y tiene " + cantidadJugadores + " jugadores.");
    }
}