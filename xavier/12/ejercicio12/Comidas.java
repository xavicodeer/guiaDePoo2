package ejercicio12;

/**
 *
 * @author xavicodeer
 */

public class Comidas {

    public String nombre;
    public String tipo;
    public double precio;

    public void mostrarInformacion() {
        System.out.println("La comida " + nombre
                + " es de tipo " + tipo
                + " y su precio es $" + precio + ".");
    }
}