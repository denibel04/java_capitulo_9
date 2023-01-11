package Ejercicio_02;

public class Bicicleta extends Vehiculo {
    private int pinones; // número de piñones

    Bicicleta(int i){
        super();
        this.pinones = 0;
    }

    public int getPinones() {
        return this.pinones;
    }

    public void caballito() {
        System.out.print("Estoy haciendo el caballito!");
    }


}
