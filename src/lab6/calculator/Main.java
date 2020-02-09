package lab6.calculator;

public class Main {
    public static void main(String[] args) {
       // String nume = "Paul";
        LogicalOP op=new LogicalOP();
        //System.out.println(op.returnName(nume));
        //String helloText=op.returnName(nume);
        //System.out.println(helloText);
        int arr[]={3,9,5,5,2,8,6,8,8,6};
        int [] newArray=new int[arr.length];
        System.out.println("Sirul initial este: ");
        op.printArray(arr);
        System.out.println("nou sir nepopulat");
        op.printArray(newArray);
        newArray=arr;
        System.out.println("Noul sir= arrayul arr" );
        op.printArray(newArray);
        System.out.println("Sirul ordonat crescator este: ");
        op.printArray(op.ordoneazaCrescator(newArray));
        op.printArray(arr);
        System.out.println();
        op.printArray(newArray);
        System.out.println();
        System.out.println("De ce ambele siruri sunt ordonate?");

        //De ce nu se pastreaza valoarea initiala la array-ul "arr" pe care nu s-a facut ordonare?

        System.out.println();
        System.out.println("Sirul ordonat descrescator cu Bubble Sort");
        op.printArray(op.sortDesc(newArray));

       System.out.println("Inserare fara adougare de element nou");
        op.printArray(op.insertArray2(arr,3,10));
        System.out.println("Inserare cu cresterea lungimii sirului");
        op.printArray(op.insertArray(arr,3,99));
        op.minMaxFromArray(arr);
        op.printArray(op.reverseArray(arr));
        System.out.println("A doua metoda de reverse");
        op.printArray(op.reverseArray2(arr));
        op.duplicateElements(arr);
        int[]myArray={1,2,3,4,55,7};
        op.printArray(newArray);
        op.printArray(myArray);
        op.commonElelments(arr, myArray);
    }
}
