package Ejercicio_05_Array;

/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 5: Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el control de los artículos de un almacén. De cada artículo
 * se debe saber el código, la descripción, el precio de compra, el precio de venta y el stock (número de unidades). El menú del programa debe tener,
 * al menos, las siguientes opciones:
 * La entrada y salida de mercancía supone respectivamente el incremento y
 * decremento de stock de un determinado artículo. Hay que controlar que no
 * se pueda sacar más mercancía de la que hay en el almacén.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int N = 100;
        int i;
        String nombre;
        String descripcion;
        double precioVenta;
        double precioCompra;
        int stock;
        boolean vacio;
        boolean existe;
        int pos = 0;

        Articulo[] articulos = new Articulo[N];


        do {
            System.out.print("Estás usando GESTISIMAL - GESTIón SIMplificada de Almacén\n" +
                    "1. Listado\n" +
                    "2. Alta\n" +
                    "3. Baja\n" +
                    "4. Modificación\n" +
                    "5. Entrada de mercancía\n" +
                    "6. Salida de mercancía\n" +
                    "7. Salir\n" +
                    "Opción : ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println(" -- Listado -- ");
                    for(i = 0; i<N; i++) {
                        if (articulos[i]!=null) {
                            System.out.println(articulos[i]);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Introduzca el nombre del articulo que quiere dar de alta: ");
                    nombre = sc.nextLine();
                    vacio = false;
                    existe = false;
                    for (i = 0; i<N && !vacio && !existe; i++) {
                        if (articulos[i]==null) {
                            vacio = true;
                            pos = i;
                        } else if (articulos[i]!=null && nombre.equalsIgnoreCase(articulos[i].getCodigo())) {
                            existe = true;
                        }
                    }
                    if (!vacio) {
                        System.out.println("No hay espacio en el almacén");
                    } else if (existe) {
                        System.out.println("Ese articulo ya se encuentra en la base de datos");
                    } else {
                        System.out.print("Introduzca la descripción del articulo: ");
                        descripcion = sc.nextLine();
                        System.out.print("Introduzca el precio de compra: ");
                        precioCompra =  Double.parseDouble(sc.nextLine());
                        System.out.print("Introduzca el precio de venta: ");
                        precioVenta =  Double.parseDouble(sc.nextLine());
                        System.out.print("Introduzca el stock: ");
                        stock = Integer.parseInt(sc.nextLine());
                        articulos[pos] = new Articulo(nombre, descripcion, precioCompra, precioVenta, stock);
                    }
                    break;
                case 3: // baja
                    System.out.print("Introduzca el codigo del articulo que quiera dar de baja: ");
                    nombre = sc.nextLine();
                    existe = false;
                    for (i = 0; i<N && !existe; i++) {
                        if(articulos[i]!=null && articulos[i].getCodigo().equalsIgnoreCase(nombre)) {
                            existe = true;
                            articulos[i] = null;
                        }
                    }
                    if (!existe) {
                        System.out.println("Ese articulo no se encuentra en la base de datos");
                    } else {
                        //articulos[pos] = null;
                        System.out.println("El articulo se ha dado de baja con éxito");
                    }
                    break;
                case 4: //modificacion
                    System.out.print("Introduzca el codigo del articulo que quiera modificar: ");
                    nombre = sc.nextLine();
                    existe = false;
                    for (i = 0; i<N && !existe; i++) {
                        if(articulos[i]!=null && articulos[i].getCodigo().equalsIgnoreCase(nombre)) {
                            existe = true;
                            pos = i;
                        }
                    }
                    if (!existe) {
                        System.out.println("Ese articulo no se encuentra en la base de datos");
                    } else {
                        System.out.println("¿Qué quiere modificar?\n" +
                                "1. Código (nombre)\n" +
                                "2. Descripción\n" +
                                "3. Precio de compra\n" +
                                "4. Precio de venta\n" +
                                "5. Stock\n" +
                                "Opción : ");
                        int opcionMod = Integer.parseInt(sc.nextLine());
                        switch (opcionMod) {
                            case 1:
                                articulos[pos].setCodigo(nombre);
                                break;
                            case 2:
                                System.out.print("Introduzca la nueva descripción");
                                descripcion = sc.nextLine();
                                articulos[pos].setDescripcion(descripcion);
                                break;
                            case 3:
                                System.out.print("Introduzca el nuevo precio de compra: ");
                                precioCompra =  Double.parseDouble(sc.nextLine());
                                articulos[pos].setPrecioCompra(precioCompra);
                                break;
                            case 4:
                                System.out.print("Introduzca el nuevo precio de venta: ");
                                precioVenta =  Double.parseDouble(sc.nextLine());
                                articulos[pos].setPrecioVenta(precioVenta);
                                break;
                            case 5:
                                System.out.print("Introduzca el nuevo stock: ");
                                stock = Integer.parseInt(sc.nextLine());
                                articulos[pos].setStock(stock);
                                break;
                        }
                    }
                    break;
                case 5: // entrada de mercancía
                    System.out.println("¿De qué artículo llega mercancía?");
                    nombre = sc.nextLine();
                    existe = false;
                    for (i = 0; i<N && !existe; i++) {
                        if(articulos[i]!=null && articulos[i].getCodigo().equalsIgnoreCase(nombre)) {
                            existe = true;
                            pos = i;
                        }
                    }
                    if (!existe) {
                        System.out.println("Ese articulo no se encuentra en la base de datos");
                    } else {
                        System.out.print("¿Cuánta mercancía llega?");
                        int cant = Integer.parseInt(sc.nextLine());
                        articulos[pos].setStock(articulos[pos].getStock()+cant);
                    }
                    break;
                case 6: // salida de mercancía
                    System.out.println("¿De qué artículo sale mercancía?");
                    nombre = sc.nextLine();
                    existe = false;
                    for (i = 0; i<N && !existe; i++) {
                        if(articulos[i]!=null && articulos[i].getCodigo().equalsIgnoreCase(nombre)) {
                            existe = true;
                            pos = i;
                        }
                    }
                    if (!existe) {
                        System.out.println("Ese articulo no se encuentra en la base de datos");
                    } else {
                        System.out.print("¿Cuánta mercancía sale?");
                        int cant = Integer.parseInt(sc.nextLine());
                        if ((articulos[pos].getStock()-cant)<0) {
                            System.out.println("Lo siento, no hay suficiente stock");
                        } else {
                            articulos[pos].setStock(articulos[pos].getStock()-cant);
                        }

                    }
                    break;
            }
        } while (opcion!=7);

        System.out.println("Gracias por usar GESTISIMAL! :D");

        sc.close();
    }
}
