package Ejercicio_03;
public abstract class Animal {
    private int edad, patas;
    private String nombre, sexo;
    public Animal(int edad, int patas, String nombre, String sexo) {
        this.edad = edad;
        this.patas = patas;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public int getPatas() {
        return patas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    void come(String comida) {
        System.out.print("Me gusta comer " + comida);
    }

    void duerme() {
        System.out.print("ZzzzZzzZ");
    }
}
