package Ejercicio_03;
public class Perro extends Mamifero {
    public Perro(int edad, int patas, String nombre, String sexo, String raza) {
        super(edad, patas, nombre, sexo, raza);
    }

    void ladra() {
        System.out.print("Guau guauuuu!!");
    }

    void juega() {
        System.out.print("Lanzame la pelota!!!!!!!");
    }

    void llora() {
        System.out.print("Sáquenme a pasear por favor :(");
    }
}
