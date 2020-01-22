package lab3.calculator;

public class Calculator {
    public int adunare(int a, int b) {
        int adunare = a + b;
        return adunare;
    }

    public short scadere(short a, short b) {
        short scadere = (short) (a - b);
        return scadere;
    }

    public long inmultire(long a, long b) {
        long inmultire = (long) (a * b);
        return inmultire;
    }

    public double impartire(double a, double b) {
        double impartire = a / b;
        return impartire;
    }
}
