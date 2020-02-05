package lab4.Calc;

public class Main {
    public static void main(String[] args) {
    LogicalOPWhile op=new LogicalOPWhile();
    op.countTo100FromGivenNumber(23);
    System.out.println();
    op.countFromGivenNumbertoMinus100(8);
    System.out.println();
    op.countFromAGivenNumberToTheSecondGivenNumber(-9,5);
    System.out.println();
    op.countFromFirstToSecondWithVerification(9,5);
    System.out.println();
    op.allEvenNumbersFrom1To100();
    System.out.println();
    op.allEvenNumbers2(-10,10);
    System.out.println();
    op.allOddNumbersFrom1To100();
    System.out.println();
    op.allOddNumbers2(-12,7);
    System.out.println();
    op.mediaSiSumaNumerelorIntregiDinIntervalul111Si8899();
    System.out.println("Media sumei numerelor divizilile cu 7 este: "+op.mediaNrDivizibileCu7DintrunInterval(1, 21));
    System.out.print("Primele 20 de numere din surul lui Fibonacci sunt: ");
    op.primele20Fibonacci();
    System.out.println();
    op.CozaLozaWoza();
    //op.cozaLozaWozaWithCase();
    }
}
