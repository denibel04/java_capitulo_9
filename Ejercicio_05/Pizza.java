package Ejercicio_05;
public class Pizza {
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    private String tam, tipo, estado;

    public Pizza(String tipo, String tam) {
        this.tam = tam;
        this.tipo = tipo;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public String toString() {
        return "Pizza " + this.tipo + " " + this.tam + ", " + this.estado;
    }

    public void sirve() {
        if (this.estado.equalsIgnoreCase("pedida")) {
            this.estado = "servida";
            totalServidas++;
        }
    }
}
