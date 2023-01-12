package Ejercicio_03;
public class Lagarto extends Mamifero{

    public Lagarto(int edad, int patas, String nombre, String sexo, String raza) {
        super(edad, patas, nombre, sexo, raza);
    }

    void tieso() {
        System.out.print("Como soy verde si me quedo quieto nadie me ve. jeje soy un crack");
    }

    void tomarElSol() {
        System.out.print("Que bien se está aquí");
    }

    void baila() {
        System.out.print("Estoy haciendo mi baile del apareamiento");
    }
}
