package Ejercicio_06;

public class Tiempo implements Cloneable{
    private final int segundos;

    public int getHoras() {
        return Math.abs(this.segundos / 3600);
    }

    public int getMinutos() {
        return Math.abs(this.segundos%3600/60);
    }

    public int getSegundos() {
        return Math.abs(this.segundos%60);
    }

    public int getSegundosTotales() {
        return this.segundos;
    }
    Tiempo(int s) {
        this.segundos = s;
    }

    public Tiempo (int h, int m, int s) {
        this.segundos = h*3600 + m*60 + s;
    }


    @Override
    public Tiempo clone(){
        return new Tiempo(this.getHoras(), this.getMinutos(), this.getSegundos());
    }

    public Tiempo suma (Tiempo t) {
        return new Tiempo(this.segundos + t.getSegundosTotales());
    }

    public Tiempo resta(Tiempo t) {
        return new Tiempo(this.segundos - t.getSegundosTotales());
    }

    @Override
    public String toString() {
        return ((this.segundos<0)?"-":"")+getHoras()+"h "+getMinutos()+"m "+getSegundos()+"s";
    }
}
