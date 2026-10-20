package ejercicio07;

/**
 *
 * @author xavicodeer
 */

public class Lagos {
    
    public String nombre;
    public String ubicacion;
    public double extensionKm2;
    
    public void mostrarInformacion() {
        System.out.println("El lago " + nombre
                + " se encuentra en " + ubicacion
                + " y tiene una extensión de " + extensionKm2 + " km².");
    }
}