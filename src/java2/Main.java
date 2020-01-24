package java2;
public class Main {
    public static void main(String[] args) {
        afis();
        System.out.println("Adunarea este: \n" + adunare(4, 6));
        System.out.println("Scaderea este: " + scadere((short) 7, (short) 8));
        System.out.println("Inmultirea este: " + inmultire((long) 7, (long) 8));
        System.out.println("Impartirea este: " + impartire(9d, 2d));
        System.out.println("-5+8*6=" + aaa(-5, 8, 6));
        System.out.println("(55+9)%9=" + bbb(55, 9));
        System.out.println("20 + -3 * 5 /8 = " + ccc(20, -3, 5, 8));
        System.out.println("5+15/3*2-8%3=" + ddd(5, 15, 3, 2, 8));
        afisjava();
        System.out.println("Media artmetica este: " + media(12d, 11d, 12d));
        smailey();
        System.out.println("Restul impartirii este: "+ rest(13,7));
        System.out.println("Temperatura 60 gradeFahrenheit este: " + celsius(60d)+" grade Celsius");
        System.out.println("100 de inchi este egal cu "+ dist(100f) +" metrii");
        System.out.println("Viteza in metrii pe secunda este: " +vit(1000f, 0f, 60f, 0f )+ " m/s");
        System.out.println("Viteza im kilometri pe ora este: "+ vit (1000f, 1f, 0f, 0f)*3.6 +" km/h");
        System.out.println("Viteza in mile pe ora este: " + vit (1000f, 1f, 0f, 0f)*3.6*0.622 + " mi/h");
    }

    public static int adunare(int a, int b) {
        int adunare = a + b;
        return adunare;
    }

    public static short scadere(short a, short b) {
        short scadere = (short) (a - b);
        return scadere;
    }

    public static long inmultire(long a, long b) {
        long inmultire = (long) (a * b);
        return inmultire;
    }

    public static double impartire(double a, double b) {
        double impartire = a / b;
        return impartire;
    }

    public static void afis() {
        System.out.println("Hello");
        System.out.println("Paul");
    }

    public static int aaa(int a, int b, int c) {
        int aaa = -a + b * c;
        return aaa;
    }

    public static int bbb(int a, int b) {
        int bbb = ((a + b) % b);
        return bbb;
    }

    public static int ccc(int a, int b, int c, int d) {
        int ccc = a + b * c / d;
        return ccc;
    }

    public static int ddd(int a, int b, int c, int d, int e) {
        int ddd = a + b / c * d - e % c;
        return ddd;
    }

    public static void afisjava() {
        System.out.println("   J    a    v     v   a");
        System.out.println("   J   a a    v   v   a a");
        System.out.println("J  J  aaaaa    v v   aaaaa");
        System.out.println(" JJ  a     a    v   a     a");
    }

    public static double media(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    public static void smailey() {
        System.out.println(" +'''''+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
    }
    public static int rest(int  a, int b){
        int rest = a%b;
        return rest;
    }
    public static double celsius(double f){
        double celsius = ((f-32)*5d/9d);
        return celsius;
    }
    public static float dist (float d){
        float dist = d/ 39.37f;
        return dist;
    }
    public static float vit (float d, float o, float m, float s){
        float t = o * 3600 + m *60 +s;
        float vit = d/t;
        return vit;
    }
}
