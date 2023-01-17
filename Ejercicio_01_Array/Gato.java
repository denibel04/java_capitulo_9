package Ejercicio_01_Array;
public class Gato {
    private String nombre, color, raza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return String.format("Me llamo %s, soy un gato de raza %s de color %s", this.nombre, this.raza, this.color);
    }
}
