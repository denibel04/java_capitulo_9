package Ejercicio_12;
public class Revista extends Publicacion {
    private int numero;

    public Revista(String ISBN, String nombre, int añoPublicacion, int numero) {
        super(ISBN, nombre, añoPublicacion);
        this.numero = numero;
    }
}
