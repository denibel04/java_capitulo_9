package Ejercicio_13;
public class CuentaCorriente {
    private double saldo;
    private String numCuenta;

    public CuentaCorriente() {
        this.generaNumero();
        this.saldo = 0;
    }

    public CuentaCorriente(int saldo) {
        this.generaNumero();
        this.saldo = saldo;
    }

    private void generaNumero() {
        numCuenta = "";
        for (int i = 0; i < 10; i++) {
            numCuenta += (int) (Math.random() * 10);
        }
    }

    public void ingreso(int ingreso) {
        this.saldo += ingreso;
    }

    public void cargo(int cargo) {
        this.saldo -= cargo;
    }

    public void transferencia(CuentaCorriente b, int dinero) {
        this.saldo -= dinero;
        b.saldo += dinero;
    }

    @Override
    public String toString() {
        return "Número de cta: " + numCuenta + " Saldo: " + String.format("%.2f", saldo) + " €";
    }
}
