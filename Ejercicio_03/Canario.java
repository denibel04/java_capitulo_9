package Ejercicio_03;
public class Canario extends Ave{
    public Canario(int edad, int patas, String nombre, String sexo, boolean esAcuatica) {
        super(edad, patas, nombre, sexo, esAcuatica);
    }
    public void canta() {
        System.out.println("Tralaralariiiiiiii");
    }
    public void caza() {
        System.out.println("Los canarios no cazan");
    }
    public void pia() {
        System.out.println("Pio pio pio");
    }
}
