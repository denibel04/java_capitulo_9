package Ejercicio_03;
public class Gato extends Mamifero {
    public Gato(int edad, int patas, String nombre, String sexo, String raza) {
        super(edad, patas, nombre, sexo, raza);
    }

    void amasa () {
        System.out.print("Estoy amasando");
    }

    void anuncio() {
        System.out.print("En la michi pizzeria todo se amasa a patita\nPide la tuya de pollito, croquetas o pescadito");
    }

    void maulla() {
        System.out.print("Miauuuuu!!");
    }

}
