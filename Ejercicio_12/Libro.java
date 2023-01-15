package Ejercicio_12;
public class Libro extends Publicacion implements Prestable {
    private boolean prestado = false;

    public Libro(String ISBN, String nombre, int añoPublicacion) {
        super(ISBN, nombre, añoPublicacion);
    }

    @Override
    public void presta() {
        if (this.prestado) {
            System.out.println("Lo siento, este libro ya esta prestado :(");
        } else {
            this.prestado = true;
        }
    }

    @Override
    public void devuelve() {
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
    }
}
