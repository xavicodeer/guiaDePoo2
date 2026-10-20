package ejercicio13;

/**
 *
 * @author xavicodeer
 */

public class Computadoras {

    public String marca;
    public String modelo;
    public double precio;

    public void mostrarInformacion() {
        System.out.println("Computadora marca " + marca
                + ", modelo " + modelo
                + ", con un precio de $" + precio + ".");
    }
}