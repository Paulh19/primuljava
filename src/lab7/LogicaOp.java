package lab7;

import java.util.List;

public class LogicaOp {
    public void addValue(List<Integer> list, int number) {
        list.add(number);
    }

    public void printList(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
//sau cu for each
            // for (String element: myList){
            // System.out.println(element);
            // }
        }
    }

    public void printListFromGinenValue(List<Integer> list, int index) {
        for (int i = 0; i < list.size(); i++) {
           // if (list.indexOf(i) >= index - 1) {//de ce index-1?
            if (i >= index ) {
                System.out.println(list.get(i));
            }
        }
    }

    public void printListOnNewLine(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Elementul "+i+" este "+list.get(i));
        }
    }
    public void printListBackwards(List<Integer> list){
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println("Elementul "+i+" este "+list.get(i));
        }
    }
    public void addStringToGivenIndex(List<String> list, int index, String elem){
        for (int i = 0; i < list.size(); i++) {
           if (i == index ) {
                list.add(index, elem);
            }
        }
    }
    public void addElementToFirstIndex(List<Integer> list, int number){
       list.add(0, number);
    }
    public int theBiggestElement (List<Integer>list){
        int max=list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max<list.get(i)){
                max=list.get(i);
            }
        }
        return max;
    }
}
