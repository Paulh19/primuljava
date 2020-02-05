package lab5.calculator;

public class LogicalOp {
    public int[] arrayToTen() {
        int[] array = new int[10];
        for (int i = 1; i <= 10; i++) {
            array[i - 1] = i;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("a["+i+"]= "+array[i]+", ");
        }
        System.out.println();
    }

    public float averageOfArray(int[] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }


    public int adunare(int a, int b) {
        int adunare = a + b;
        return adunare;
    }
    public float adunare (float a, float b){
        float adunare = a + b;
        return adunare;
    }
    public int adunare(int a, int b, int c) {
        int adunare = a + b + c;
        return adunare;
    }
    public float adunare(float a, int b) {
        float adunare = a + b;
        return adunare;
    }
    public short scadere(short a, short b) {
        short scadere = (short) (a - b);
        return scadere;
    }
    public double scadere(double a, double b) {
        double scadere = a - b;
        return scadere;
    }
    public double scadere(int a, double b) {
        double scadere = a - b;
        return scadere;
    }

    public long inmultire(long a, long b) {
        long inmultire = (long) (a * b);
        return inmultire;
    }
    public int inmultire(int a, int b, int c) {
        int inmultire = a * b*c;
        return inmultire;
    }
    public float inmultire(float a, int b) {
        float inmultire = a * b;
        return inmultire;
    }
    public float inmultire(float a, float b) {
        float inmultire = a * b;
        return inmultire;
    }

    public double impartire(double a, double b) {
        double impartire = a / b;
        return impartire;
    }
    public int impartire(int a, int b) {
        int impartire = a / b;
        return impartire;
    }
    public double impartire(double a, double b,double c) {
        double impartire = a / b/c;
        return impartire;
    }
    public int[] arrayToHundred() {
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            array[i - 1] = i;
        }
        return array;
    }
    public int[] arrayToGivenLength(int n) {
        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i - 1] = 0;
        }
        return array;
    }
    public int[] populare(int[] array){
        for (int i = 1; i <=array.length; i++) {
            array[i - 1] = 2*i;
        }
        return array;
    }
    public void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("a["+i+"]= "+array[i]+", ");
        }
        System.out.println();
    }
    public boolean findStringInArray (String[] array, String text){
        boolean x=false;
        for (int i=0; i<array.length; i++){
            if (array[i].equals(text)) {
                x= true;
            }
        }
        return x;
    }
    public int verifyIfNumberINArray( int []array, int number){
        int pozition= -1;
        for (int i=0; i<array.length; i++){
            if (array[i]==number) {
                pozition= i;
            }
        }
        return pozition;
    }
    public void afis_(){
        String [][] a= new String[10][10];
        for (int i=0; i<10;i++){
            for (int j=0; j<10;j++){
                System.out.print("_ ");
            }
            System.out.println();
        }
    }
    public int[] removeNumberFromArray(int [] array, int number){
        int j=0;
        for (int i=0; i<array.length; i++){
            if (array[i]!=number){
                j++;
            }
        }
        int [] mArray= new int[j];
        j=0;
        for (int i=0; i<array.length;i++) {
            if (array[i] != number) {
                mArray[j] = array[i];
                j++;
            }
        }
        return mArray;
    }
    public int secondSmallestNumber(int[] array){
        int max=0;
        for (int i=0; i<array.length;i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int smallest=max;

        if (array.length<=1){
            System.out.println("The array is to short");
        }
        int secondSmallest=array[0];
        for (int i=0; i<array.length;i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }
        return secondSmallest;


        /* Al doilea cel mai mic, se mai poate face si prin alte metode.
        1. Ordonarea sirului print-o bucla while si a variabila booleana care opreste bucla cand sirul este ordonat.
           Odata sirul ordonat se afiseaza a doua(sau penultima, depinde cum este ordonat sirul) variabila.
        2. Se parcurge odata sirul integistrand cea mai mica valoare.
           Se elimina cea mai mica valoare  (se poate folosi removeNumberFromArray(int [] array, int number)).
           Se mai parcurge odata sirul si se afiseaza cea mai mica valoare.
         */


    }
    public int [] copyArray (int [] array, int [] anotherArray){
        if (array.length<anotherArray.length){
            System.out.println("The length of the first array needs to be at least the size of the empty array");
        }
        for (int i=0; i<array.length; i++){
            anotherArray[i]=array[i];

        }
        return anotherArray;
    }
}

