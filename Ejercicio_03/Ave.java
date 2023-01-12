package Ejercicio_03;
public abstract class Ave extends Animal {
    private boolean esAcuatica;

    public Ave(int edad, int patas, String nombre, String sexo, boolean esAcuatica) {
        super(edad, patas, nombre, sexo);
        this.esAcuatica = esAcuatica;
    }

    public void ponHuevo() {
        if (this.getSexo().equalsIgnoreCase("hembra")) {
            System.out.println("Ahi va eso... un huevo");
        } else {
            System.out.println("Soy macho, no puedo poner huevos u.u");
        }
    }
    public void limpiate() {
        System.out.println("Me estoy limpiando las plumas");
    }
    public void vuela() {
        System.out.println("Estoy volando");
    }
}
