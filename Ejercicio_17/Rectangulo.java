package Ejercicio_17;
public class Rectangulo {
    private static int rectangulosCreados;
    private int base, altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 1; i<=altura; i++) {
            for(int j = 1; j<=base; j++) {
                cadena +='*';
            }
            cadena += '\n';
        }
        return cadena;
    }
}
