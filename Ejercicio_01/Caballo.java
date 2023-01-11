package Ejercicio_01;
public class Caballo {
    private int edad, premios;
    private String nombre, raza, color;

     Caballo (String n, String r, String c, int e, int p) {
        this.nombre = n;
        this.raza = r;
        this.color = c;
        this.edad = e;
        this.premios = p;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getPremios() {
        return this.premios;
    }

    public String getRaza() {
        return this.raza;
    }

    public String getColor() {
        return this.color;
    }

    void relincha() {
        System.out.println("¡hiiii, hiiii, hiiii!");
    }

    void come() {
        System.out.println("ñam ñam ñam");
    }

    void duerme() {
        System.out.println("zzZzzZZz");
    }

    void aTodoGalope() {
        System.out.println("tocotoc tocotoc tocotoc");
    }

    void trotar() {
        System.out.println("taptap taptap");
    }

}
