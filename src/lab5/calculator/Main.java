package lab5.calculator;

public class Main {
    public static void main(String[] args) {
        int [] myArray=new int[10];
        LogicalOp op = new LogicalOp();
        int [] newArray =op.arrayToTen();
        op.printArray(newArray);
        System.out.println(op.averageOfArray(newArray));
       int [] secondArray={2,8,7,5,8,5,9,99};
        op.printArray(secondArray);
        System.out.println("Adunarea cu float: "+op.adunare(5.6f, 6.4f));
        System.out.println("Adunarea cu integer: "+op.adunare(5,6));
        System.out.println("Adunara cu 3 numere intregi: "+op.adunare(2,4,7));
        System.out.println("Adunarea cu un numat float si unu intreg: "+op.adunare(4.7f, 4));
        System.out.println("Scaderea cu short: "+op.scadere((short)4, (short)-3));
        System.out.println("Scaderea cu double: "+op.scadere(4.5, 2.5));
        System.out.println("Scaderea cu un nr intreg si unu double: "+op.scadere(4, 4.5));
        System.out.println("Inmultirea cu long: "+op.inmultire(2l,3l));
        System.out.println("Inmultirea a trei numere intregi: "+op.inmultire(2,3,4));
        System.out.println("Inmultirea cu double si intrg: " +op.inmultire(4.5f, 3));
        System.out.println("Inmultirea cu float: "+op.inmultire(2.5f, 2.5f ));
        System.out.println("Impartirea cu double: "+op.impartire(4d, 3d));
        System.out.println("Impartirea cu nr intregi: "+op.impartire(4,2));
        System.out.println("Impartirea cu 3 numere double: "+op.impartire(8d, 2d,7d));
        int aArray[]= new int[100];
        int oneHundredArray[]=op.arrayToHundred();
        op.printArray(oneHundredArray);
        int evenNumbersArray[]=op.arrayToGivenLength(50);
        op.printArray(evenNumbersArray);
        int evenNrArray[] = op.populare(evenNumbersArray);
        op.printArray(evenNrArray);
        System.out.println();
        String[] nameArray={"Paul", "George", "Ionut","Catalin", "Ioana", "Elena"};
        op.printArray(nameArray);
        System.out.println("Teaxtul a fost gasit in lista: " +op.findStringInArray(nameArray, "elena"));
        int x=(op.verifyIfNumberINArray(secondArray, 8));
        if (x==-1){
            System.out.println("Numarul nu fost gasit in sir");
        }else System.out.println("Ultima pozitie pe care numarul a fost intalnit este: "+x);
        x=(op.verifyIfNumberINArray(secondArray, 1));
        if (x==-1){
            System.out.println("Numarul nu fost gasit in sir");
        }else System.out.println("Ultima pozitie pe care numarul a fost intalnit este: "+x);
        op.afis_();
        System.out.println("Sirul initial este: ");
        op.printArray(secondArray);
        op.printArray(op.removeNumberFromArray(secondArray, 8));
        System.out.println("The second smallest number from the array is: "+op.secondSmallestNumber(secondArray));
        System.out.println("The empty array");
        int []arr =op.arrayToGivenLength(8);
        op.printArray(arr);
        System.out.println("The array after copy");
        int bb[]=op.copyArray(secondArray, arr);
        op.printArray(bb);

    }
}
