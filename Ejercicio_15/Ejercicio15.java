package Ejercicio_15;
/*
 * Capítulo 9 - programación orientada a objetos
 * Ejercicio 15: Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de forma aleatoria, que encajen bien y que estén bien colocadas
 * según el juego del dominó. No hay que controlar si se repiten o no las fichas.

 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio15 {
    public static void main (String[] args) {
        FichaDomino[] fichas = new FichaDomino[8];
        fichas[0] = new FichaDomino();
        for(int i = 1; i<8; i++) {
            FichaDomino aux;
            do {
                aux= new FichaDomino();
            } while (!aux.encajaEnFila(fichas[i-1], aux));
            fichas[i] = aux;
        }

        for (FichaDomino ficha:fichas) {
            System.out.print(ficha);
        }
    }
}
