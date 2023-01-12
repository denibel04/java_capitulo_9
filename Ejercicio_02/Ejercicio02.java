package Ejercicio_02;
/*
 * Capítulo 8 - programación orientada a objetos 
 * Ejercicio 2: Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra a
 * continuación:
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int km;
        Bicicleta bici = new Bicicleta(9);
        Coche coche = new Coche(1900);
        do {
            System.out.print("VEHÍCULOS\n" +
                    "=========\n" +
                    "1. Anda con la bicicleta\n" +
                    "2. Haz el caballito con la bicicleta\n" +
                    "3. Anda con el coche\n" +
                    "4. Quema rueda con el coche\n" +
                    "5. Ver kilometraje de la bicicleta\n" +
                    "6. Ver kilometraje del coche\n" +
                    "7. Ver kilometraje total\n" +
                    "8. Salir\n" +
                    "Elige una opción (1-8):\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    km = sc.nextInt();
                    bici.recorre(km);
                    break;
                case 2:
                    bici.caballito();
                    break;
                case 3:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    km = sc.nextInt();
                    coche.recorre(km);
                    break;
                case 4:
                    coche.quemaRueda();
                    break;
                case 5:
                    System.out.println("La bicicleta lleva recorridos ");
                    System.out.println(bici.getKilometrosRecorridos() + " Km");
                    break;
                case 6:
                    System.out.println("El coche lleva recorridos ");
                    System.out.println(coche.getKilometrosRecorridos() + " Km");
                    break;
                case 7:
                    System.out.println("Los vehículos llevan recorridos ");
                    System.out.println(Vehiculo.getKilometrosTotales() + " Km");
                default:
                }
            } while (opcion != 8);

        sc.close();
    }
}
