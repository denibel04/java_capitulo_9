package Ejercicio_04;
public class Fraccion implements Cloneable {
    private int numerador;
    private int denominador;

    public int getNumerador(){
        return this.numerador;
    }

    public int getDenominador(){
        return this.denominador;
    }

    Fraccion(){
        this.numerador = 0;
        this.denominador = 1;
    }
    Fraccion(int num, int den) {
        this();
        if (den==0) {
            System.out.print("Error: el denominador no puede ser 0");
        }
        else {
            this.numerador = num;
            this.denominador = den;
        }
    }

    Fraccion(Fraccion f){
        this(f.getNumerador(), f.getDenominador());
    }

    @Override
    public Fraccion clone() {
        return new Fraccion(this.getNumerador(), this.getDenominador());
    }

    public Fraccion invierte() {
        return new Fraccion(this.denominador, this.numerador);
    }

    public Fraccion multiplica(Fraccion f) {
        return new Fraccion(this.numerador*f.numerador, this.denominador*f.denominador);
    }

    public Fraccion multiplica(int n) {
        return this.multiplica(new Fraccion(n, 1));
    }

    public Fraccion divide(Fraccion f) {
        return this.multiplica(f.invierte());
    }

    public Fraccion divide(int n) {
        return this.divide(new Fraccion(n, 1));
    }

    public Fraccion simplifica() {
        int num = this.numerador;
        int den = this.denominador;
        int menor = Math.min(num, den);
        for (int i = 2; i <= Math.abs(menor); i++) {
            if (num%Math.abs(i)==0 && den%Math.abs(i)==0) {
                num/=i;
                den/=i;
                menor = Math.min(num, den);
            }
        }
        return new Fraccion(num, den);
    }

    @Override
    public String toString() {
        boolean negativo = (this.numerador < 0 || this.denominador < 0) && !(this.numerador < 0 && this.denominador < 0);
        return (negativo?"-":"")+Math.abs(this.numerador)+"/"+Math.abs(this.denominador);
    }
}
