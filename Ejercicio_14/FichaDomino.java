package Ejercicio_14;

public class FichaDomino {
    private int num1, num2, aux;
    public FichaDomino(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "[ " + num1 + " | " + (num2 == 0 ? " " : num2) + " ]";
    }

    public FichaDomino voltea() {
        return new FichaDomino(num2, num1);
    }

    public boolean encaja(FichaDomino ficha) {
        if (this.num1 == ficha.num1 || this.num1 == ficha.num2 || this.num2 == ficha.num1 || this.num2 == ficha.num2) {
            System.out.print("eres dios - ");
            return true;
        } else {
            return false;
        }

    }
}
