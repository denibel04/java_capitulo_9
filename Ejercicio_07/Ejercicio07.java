package Ejercicio_07;
/*
 * Capítulo 9 - programación orientada a objetos
 * Ejercicio 7: Queremos gestionar la venta de entradas (no numeradas) de Expocoches Campanillas que tiene 3 zonas, la sala principal con 1000 entradas
 * disponibles, la zona de compra-venta con 200 entradas disponibles y la zona vip con 25 entradas disponibles. Hay que controlar que existen entradas
 * antes de venderlas.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio07 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);
        int opcion;
        int opcionZona;
        int numEntradas;
        do {
            System.out.print("-- Expocoches Campanillas --\n" +
                    "1. Mostrar número de entradas libres\n" +
                    "2. Vender entradas\n" +
                    "3. Salir\n" +
                    "Elige una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.printf("Quedan %d entradas en la zona principal, %d en la zona de compra-venta y %d en la vip\n", principal.getEntradasPorVender(), compraVenta.getEntradasPorVender(), vip.getEntradasPorVender());
                    break;
                case 2:
                    System.out.print("¿En qué zona quiere las entradas? \n1. Principal \n2. Compra-venta\n3. VIP\nIntroduzca su opcion: ");
                    opcionZona = sc.nextInt();
                    System.out.print("¿Cuántas entradas serían? ");
                    numEntradas = sc.nextInt();
                    switch (opcionZona) {
                        case 1:
                            principal.vender(numEntradas);
                            break;
                        case 2:
                            compraVenta.vender(numEntradas);
                            break;
                        case 3:
                            vip.vender(numEntradas);
                            break;
                    }
                    break;
            }
        } while (opcion != 3);

        sc.close();
    }
}
