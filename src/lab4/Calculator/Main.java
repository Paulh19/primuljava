package lab4.Calculator;

public class Main {
    public static void main(String[] args) {
        LogicalOp op=new LogicalOp();
        op.countFromGivenNumber(6);
        System.out.println();
        op.countBackwardsFromGivenNumber(-9);
        System.out.println();
        op.countFromAFirstGivenNumberToASecondGivenNumber(2, 8);
        System.out.println();
        op.countFromSmallerNumberToBiggerNumber(9,7);
        System.out.println();
        op.afisNrPareDeLa1La100();
        System.out.println();
        op.afisPare(7,10);
        System.out.println();
        op.afisImpare(1,10);
        System.out.println();
        op.afisImpare2();
        System.out.println();
        System.out.println(op.sumFromAGiven(99));
        System.out.println(op.avaregeFromSum(99));
        op.afisStelute(9);
    }
}
