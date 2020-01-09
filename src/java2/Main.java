package java2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adunarea este " +adunare(4,6));
        System.out.println("Scaderea este " +scadere((short) 7,(short)8));
        System.out.println("Inmultirea este " +inmultire((long) 7,(long)8));
        System.out.println("Impartirea este " +impartire(9d,2d));
    }
    public static  int adunare (int a, int b) {
        int adunare = a + b;
        return adunare;
    }
    public static short scadere (short a, short b){
        short scadere = (short) (a - b);
        return scadere;
    }
    public static long inmultire (long a, long b){
        long inmultire = (long) (a*b);
        return inmultire;
    }
    public static double impartire (double a, double b){
        double impartire = a/b;
        return impartire;
    }
    public static int putere (int a, int b){
        putere = a^b;
        return putere;
    }
}
