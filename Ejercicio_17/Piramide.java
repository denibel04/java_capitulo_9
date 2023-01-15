package Ejercicio_17;
public class Piramide {
    private static int piramidesCreadas;
    private int altura;

    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i=1; i<=altura; i++) { //contador para la altura
            for (int j=1; j<=altura-i; j++) { //imprime espacios
                cadena += ' ';
            }
            for (int k=1; k<=i*2-1; k++) { //imprime el caracter de relleno
                cadena += '*';
            }
            cadena += '\n';
        }
        return cadena;
    }
}
