package Ejercicio_15;

public class FichaDomino {
    private int num1, num2, aux;
    public FichaDomino() {
        this.num1 = (int)(Math.random()*7);
        this.num2 = (int)(Math.random()*7);
    }

    public FichaDomino(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "[ " + (num1 == 0 ? " " : num1) + " | " + (num2 == 0 ? " " : num2) + " ] ";
    }

    public FichaDomino voltea() {
        return new FichaDomino(num2, num1);
    }

    public boolean encaja(FichaDomino ficha) {
        return this.num1 == ficha.num1 || this.num1 == ficha.num2 || this.num2 == ficha.num1 || this.num2 == ficha.num2;
    }

    public boolean encajaEnFila(FichaDomino ficha1, FichaDomino ficha2) {
        return ficha1.num2 == ficha2.num1;
    }
}
