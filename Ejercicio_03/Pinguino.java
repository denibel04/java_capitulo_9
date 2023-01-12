package Ejercicio_03;
public class Pinguino extends Ave {

    public Pinguino(int edad, int patas, String nombre, String sexo, boolean esAcuatica) {
        super(edad, patas, nombre, sexo, esAcuatica);
    }

    public void nada() {
        System.out.print("Me estoy dando un buen chapuzón :D");
    }

    public void mision() {
        System.out.print("Kowalski, opciones");
    }

    @Override
    public void vuela() {
        System.out.print("Soy un pingüino, no puedo volar estupida");
    }
}
