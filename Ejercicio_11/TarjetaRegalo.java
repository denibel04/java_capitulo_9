package Ejercicio_11;
import java.text.DecimalFormat;
public class TarjetaRegalo {
    private double saldo;
    private int numero;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.numero =  (int)(10000 + Math.random() * 90000);
    }

    public void gasta(double dineroGastado) {
        if (dineroGastado > saldo) {
            System.out.println("Lo siento, no tiene suficiente saldo para gastar " + dineroGastado + "€");
        } else {
            this.saldo -= dineroGastado;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo tr2) {
        TarjetaRegalo tr3 = new TarjetaRegalo(this.saldo + tr2.saldo);
        this.saldo = 0;
        tr2.saldo = 0;
        return tr3;
    }

    @Override
    public String toString() {
        DecimalFormat dosDecimales = new DecimalFormat("0.00");
        return "Tarjeta nº " + numero + " – Saldo " + dosDecimales.format(saldo) + "€";
    }
}
