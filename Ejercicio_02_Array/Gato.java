package Ejercicio_02_Array;
public class Gato {
    private String nombre, color, sexo;

    public Gato(String nombre, String color, String sexo) {
        this.nombre = nombre;
        this.color = color;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return String.format("Me llamo %s, soy un gato %s de color %s", this.nombre, this.sexo, this.color);
    }
}
