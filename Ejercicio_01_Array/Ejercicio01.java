package Ejercicio_01_Array;
/*
 * Capítulo 9 - programación orientada a objetos 
 * Ejercicio 1: Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos de cada uno de ellos mediante un bucle. Muestra a
 * continuación los datos de todos los gatos utilizando también un bucle.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Gato[] gatitos = new Gato[4];
        System.out.println("Introduzca los datos de sus gatos");
        for(int i=0; i<4; i++) {
            gatitos[i] = new Gato();
            System.out.printf("-- Gato %d --\n", i+1);
            // Nombre
            System.out.print("Nombre: ");
            String nombre = sc.next();
            gatitos[i].setNombre(nombre);
            // Color
            System.out.print("Color: ");
            String color = sc.next();
            gatitos[i].setColor(color);
            // Raza
            System.out.print("Raza: ");
            String raza = sc.next();
            gatitos[i].setRaza(raza);
        }
        sc.close();

        // Muestra los gatos por pantalla
        for(int i = 0; i<4; i++) {
            System.out.println(gatitos[i]);
        }
    }
}
