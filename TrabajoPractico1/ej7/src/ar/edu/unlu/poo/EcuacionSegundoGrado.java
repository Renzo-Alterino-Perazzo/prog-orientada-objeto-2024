package ar.edu.unlu.poo;

public class EcuacionSegundoGrado {
    private final double a;
    private final double b;
    private final double c;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean unaRaiz(){
        return (Math.pow(b, 2) - 4 * a * c)==0;
    }
    public double calcularDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double calcularRaiz1() {
        double discriminante = calcularDiscriminante();
        if (discriminante >= 0) {
            return (-b + Math.sqrt(discriminante)) / (2 * a);
        } else {
            return Double.NaN; // No hay raíces reales.
        }
    }

    public double calcularRaiz2() {
        double discriminante = calcularDiscriminante();
        if (discriminante >= 0) {
            return (-b - Math.sqrt(discriminante)) / (2 * a);
        } else {
            return Double.NaN; // No hay raíces reales.
        }
    }

    public double calcularValorY(double x) {
        return a * Math.pow(x, 2) + b * x + c;
    }
}
