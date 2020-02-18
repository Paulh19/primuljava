package lab7.temaOptionala;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList= new ArrayList<>();
        myList.add(23);
        myList.add(76);
        myList.add(5);
        myList.add(3);
        myList.add(66);
        myList.add(990);
        myList.add(3);

        List<Integer> secondList= new ArrayList<>();
        secondList.add(12);
        secondList.add(2);
        secondList.add(121);
        secondList.add(1222);
        secondList.add(123);
        secondList.add(152);
        System.out.println(myList);
        LogicalOP op=new LogicalOP();
        myList.add(3, 11);
        System.out.println(myList);
        op.exchangePosition(myList,1,2);
        System.out.println(myList);
        System.out.println(op.evenElements(myList));
        System.out.println(op.listSort(myList));//nu sorteaza daca daca cel mai mare nr e primul sau ultimul
        System.out.println(op.listSortDescending(secondList)); //nu sorteaza bine, ultimul element
        System.out.println(op.listsort2(myList));
    }
}
