package Ejercicio_01;

/*
 * Capítulo 8 - programación orientada a objetos 
 * Ejercicio 1: Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main (String[] args) {
        Caballo rainbowDash = new Caballo("Rainbow Dash", "pegaso", "azul", 16, 132);
        Caballo appleBloom = new Caballo("Apple Bloom", "pony", "rosa", 12, 3);

        System.out.printf("Mi nombre es %s, y soy un %s %s. He ganado %d premios!\n", rainbowDash.getNombre(), rainbowDash.getRaza(), rainbowDash.getColor(), rainbowDash.getPremios());
        rainbowDash.trotar();
        rainbowDash.aTodoGalope();

        System.out.printf("\nMi nombre es %s, y soy un %s %s de %d años ", appleBloom.getNombre(), appleBloom.getRaza(), appleBloom.getColor(),appleBloom.getEdad());
        appleBloom.relincha();
        appleBloom.come();
        appleBloom.duerme();

    }
}
