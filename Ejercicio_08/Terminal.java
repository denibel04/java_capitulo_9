package Ejercicio_08;

public class Terminal {
    private int tiempoEnLlamada;
    private String telefono;

    // constructor
    public Terminal(String telefono) {
        this.telefono = telefono;
        tiempoEnLlamada = 0;
    }

    // getter
    public int getTiempoEnLlamada() {
        return tiempoEnLlamada;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Nº " + telefono + " - " + this.tiempoEnLlamada + "s de conversación";
    }

    public void llama(Terminal telefono, int tiempoEnLlamada) {
        this.tiempoEnLlamada += tiempoEnLlamada;
        telefono.tiempoEnLlamada += tiempoEnLlamada;
    }
}
