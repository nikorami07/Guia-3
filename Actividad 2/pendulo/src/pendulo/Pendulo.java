package pendulo;

import java.util.Scanner;

public class Pendulo {

    public static final double g = 9.805;
    public double l;
    public double p;

    public Pendulo() {
        this.p = 0;
        this.l = 0;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getG() {
        return g;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double PeriodoDeOcilación() {

        p = (((2 * 3.1416) * (Math.sqrt(g / l))));
        return p;

    }

    public void imprimir() {
        System.out.print("El valor del periodo es " + p + "\n");
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor de la longitud: ");
        double l = teclado.nextDouble();

        Pendulo pen = new Pendulo();

        pen.imprimir();

    }

}
