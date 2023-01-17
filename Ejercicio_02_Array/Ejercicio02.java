package Ejercicio_02_Array;
/*
 * Capítulo 9 - programación orientada a objetos 
 * Ejercicio 2: Cambia el programa anterior de tal forma que los datos de los gatos se introduzcan directamente en el código de la forma
 * gatito[2].setColor("marrón") o bien mediante el constructor, de la forma gatito[3] = new Gato("Garfield", "naranja", "macho"). Muestra
 * a continuación los datos de todos los gatos utilizando un bucle.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio02 {
    public static void main (String[] args) {
        Gato[] gatito = new Gato[4];
        gatito[0] = new Gato("Juanarrow", "chocolate", "pornstar");
        gatito[1] = new Gato("Rin", "blanco y negro", "hembra");
        gatito[2] = new Gato("Len", "siames rubio", "macho");
        gatito[3] = new Gato("Jesus", "negro", "peruano");

        // Muestra los gatos por pantalla
        for(int i = 0; i<4; i++) {
            System.out.println(gatito[i]);
        }
    }

}
