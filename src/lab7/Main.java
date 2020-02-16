package lab7;


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> myList= new ArrayList();
        myList.add("Hello");
        myList.add("Everybody");
        myList.add("Hey");
        String m ="Paul";
        myList.add(m);
       // System.out.println(myList);
        List<Integer> list2= new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        LogicaOp op = new LogicaOp();
        op.printListOnNewLine(list2);
        System.out.println(list2);
        op.addValue(list2,10);
        System.out.println(list2);
        System.out.println(myList);
        op.printList(myList);
        op.printListFromGinenValue(list2, 1);
        op.printListBackwards(list2);
        op.addStringToGivenIndex(myList, 1, "Paul and ");
        op.printList(myList);
        op.addElementToFirstIndex(list2, 35);
        op.printListOnNewLine(list2);
        System.out.println("The biggest element is: "+op.theBiggestElement(list2));
    }
}
