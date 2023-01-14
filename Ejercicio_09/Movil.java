package Ejercicio_09;
import java.text.DecimalFormat;
public class Movil extends Terminal {
    private String tarifa;
    private double coste;

    public Movil(String telefono, String tarifa) {
        super(telefono);
        this.tarifa = tarifa;
        this.coste = 0;
    }

    @Override
    public void llama(Terminal telefono, int tiempoEnLlamada) {
        super.llama(telefono, tiempoEnLlamada);
        double minutos = (double)(tiempoEnLlamada/60);
        switch (tarifa) {
            case "rata":
                this.coste += minutos*0.06;
                break;
            case "mono":
                this.coste += minutos*0.12;
                break;
            case "bisonte":
                this.coste += minutos*0.30;
                break;
        }
    }

    @Override
    public String toString() {
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Nº " + this.getTelefono() + " - " + this.getTiempoEnLlamada() + "s de conversación - tarificados " + formatoEuros.format(this.coste) + " euros";
    }
}
