package lab3.calculator;

public class Main {

    public static void main(String[] args) {
        LogicalOp op=new LogicalOp();
        int a=3;
        System.out.println(op.pr3(a));
        Calculator ca =new Calculator();
        System.out.println(ca.adunare(2, 33));
        System.out.println(ca.impartire(6d, 4d));
        System.out.println(ca.scadere((short)10, (short)3));
        System.out.println(ca.inmultire(3l, 4l));

        int biggest = op.checkBiggerNumber(2,3);
        System.out.println("The bigger number is: " + biggest);
        String text = "FastTrackIT";
        System.out.println(op.checkText(text));

        System.out.println(op.checkTextAndNumber(text, 3));
        System.out.println(op.chechForecast(8));
        System.out.println(op.checkNumber(5));
        System.out.println(op.afisNumar(1));
        System.out.println(op.isNumberEven(5));
        System.out.println(op.isEligibleToVote(19));
        System.out.println(op.celMaiMare(1, 1,2));
    }
}
