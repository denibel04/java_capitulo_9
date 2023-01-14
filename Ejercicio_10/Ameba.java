package Ejercicio_10;
public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public int getPeso() {
        return this.peso;
    }

    void come(int microgramos) {
        this.peso += microgramos - 1;
    }

    void come(Ameba victima) {
        this.peso += victima.peso - 1;
        victima.peso = 0;
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso " + peso + " microgramos";
    }
}
