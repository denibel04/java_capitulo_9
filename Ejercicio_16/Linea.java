package Ejercicio_16;
public class Linea {
    private Punto pinicial, pfinal;

    public Linea(Punto pinicial, Punto pfinal) {
        this.pinicial = pinicial;
        this.pfinal = pfinal;
    }

    @Override
    public String toString() {
        return "Línea formada por los puntos " + pinicial +" y " + pfinal;
    }
}
