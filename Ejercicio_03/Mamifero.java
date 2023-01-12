package Ejercicio_03;
public abstract class Mamifero extends Animal {
    private String raza;
    public Mamifero(int edad, int patas, String nombre, String sexo, String raza) {
        super(edad, patas, nombre, sexo);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void amamanta() {
        if (this.getSexo().equalsIgnoreCase("hembra")) {
            System.out.print("Toma lechita");
        } else {
            System.out.print("No te puedo dar pecho :(");
        }
    }

    public void tomarPecho() {
        if (this.getEdad()<=1) {
            come("leche");
        } else {
            System.out.print("Ya soy grande para eso >:(");
        }
    }

    public void camina() {
        System.out.print("Camino usando mis " + getPatas() + " patitas");
    }

}
