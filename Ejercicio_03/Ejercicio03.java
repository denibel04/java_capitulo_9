package Ejercicio_03;
/*
 * Capítulo 9 - programación orientada a objetos
 * Ejercicio 3: Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea, al menos, tres métodos específicos de cada clase
 * y redefine el/los método/s cuando sea necesario. Prueba las clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio03 {
    public static void main (String[] args) {
        Pinguino skipper = new Pinguino(6, 2, "Skipper", "macho", true);
        skipper.vuela();
        System.out.println();
        skipper.mision();
        System.out.println();
        skipper.ponHuevo();

        System.out.println();
        Gato rin = new Gato(3, 4, "Rin", "hembra", "común europeo");
        rin.amasa();
        System.out.println();
        rin.anuncio();
        System.out.println();
        rin.maulla();
        System.out.println();

        System.out.println();
        Lagarto gecko = new Lagarto(1, 4, "Gecko", "macho", "Camaleón");
        gecko.tieso();
        System.out.println();
        gecko.come("mosca");
        System.out.println();
        gecko.tomarPecho();
        System.out.println();
    }
}
