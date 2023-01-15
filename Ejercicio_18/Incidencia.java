package Ejercicio_18;
public class Incidencia {
    private int codigo, numPuesto;
    private String estado, problema, solucion;

    private static int i = 1;
    private static int pendientes = 0;

    public Incidencia(int numPuesto, String problema) {
        this.numPuesto = numPuesto;
        this.problema = problema;
        this.codigo = i;
        this.estado = "Pendiente";
        pendientes++;
        i++;
    }

    public static int getPendientes() {
        return pendientes;
    }

    public void resuelve(String solucion) {
        this.solucion = solucion;
        this.estado = "Resuelta";
        pendientes--;
    }

    @Override
    public String toString(){
        return String.format("Incidencia %d - Puesto: %d - %s - %s" + (this.estado.equals("Resuelta")?" - %s":""), this.codigo, this.numPuesto, this.problema, this.estado, this.solucion);
    }
}
