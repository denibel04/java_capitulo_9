package Ejercicio_12;
public class Publicacion {
    private int añoPublicacion;
    private String titulo, ISBN;

    public Publicacion(String ISBN, String nombre, int añoPublicacion) {
        this.ISBN = ISBN;
        this.añoPublicacion = añoPublicacion;
        this.titulo = nombre;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", título: " +  titulo + ", año de publicación: " + añoPublicacion;
    }

}
