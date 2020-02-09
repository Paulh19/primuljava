package lab6.calculator;

public class LogicalOP {
    public String returnName(String name){
        return "Hallo"+name;
    }

    public void printName(String name){
        System.out.println("Hallo "+name);
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("a["+i+"]= "+array[i]+", ");
        }
        System.out.println();
    }

    public int [] ordoneazaCrescator(int [] array){
        boolean verif=true;
        int x=0;
        while (verif){
            verif = false;
            for (int i=0; i<(array.length-1); i++){

                if (array[i]>array[i+1]){
                    x=array[i];
                    array[i]=array[i+1];
                    array[i+1]=x;
                    verif= true;
                }
            }
        }
        return array;
    }

    public int [] sortDesc(int array[]){
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<(array.length);j++){
                if (array[i]<array[j]){
                   int x=array[i];
                   array[i]=array[j];
                   array[j]=x;
                }
            }
        }
        return array;
    }

    public int [] insertArray (int array[], int position, int number){

        int[] rez = new int[array.length+1];
        for (int i=0; i<position; i++) {
                rez[i] = array[i];
        }
        rez[position]=number;
        for (int i=(position+1); i<(array.length+1);i++){
            rez[i]=array[i-1];
        }
        return rez;
    }

    public int [] insertArray2 (int array[], int position, int number) {
        for (int i = 0; i < array.length; i++) {
            if (i == position) {
                array[i] = number;
            }
        }
        return array;
    }
    public void minMaxFromArray ( int array[]){
        int min=array[0];
        int max=array[0];
        for (int i=0;i<array.length; i++){
            if (array[i]<min){
                min=array[i];
            }
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Elementul cel mai mic din sir este: "+min);
        System.out.println("Elementul maxim din sir este: "+max);
    }
    public int[]reverseArray(int array[]){
        int j=0;
        int []rez=new int[array.length];
        for (int i=array.length-1;i>=0;i--){
            rez[j]=array[i];
            j++;
        }
        return rez;
    }
    public int[] reverseArray2 (int array[]){
        int []rez=new int[array.length];
        for (int i=0;i<array.length;i++){
            rez[array.length-1-i]=array[i];
        }
        return rez;
    }

    public void duplicateElements(int []array){
        for (int i=0;i<array.length;i++) {
            for (int j = i + 1; j < (array.length); j++) {
                if (array[i] == array[j]) {
                    System.out.println("Numarul "+array[j]+" este duplicat");
                    break;
                }
            }
        }
    }

    public void commonElelments(int[] first, int second[]){
        for (int i=0;i<first.length;i++) {
            for (int j = 0; j < (second.length); j++) {
                if (first[i] == second[j]) {
                    System.out.println("Numarul "+first[i]+" este comun celor 2 siruri");
                    break;
                }
            }
        }
    }
}
