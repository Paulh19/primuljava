package lab7.temaOptionala;

import java.util.ArrayList;
import java.util.List;

public class LogicalOP {
    public void printList(List<Integer>list){
        for (int i=0; i<list.size(); i++)
            System.out.println("Elementul "+i+" este "+list.get(i));
    }
    public void exchangePosition (List<Integer> list, int index1, int index2){
               int temp=list.get(index1);
                list.remove(index1);
                list.add(index1, list.get(index2-1));
                list.remove(index2);
                list.add(index2, temp);
    }
    public List<Integer> evenElements(List<Integer> list){
        List<Integer> newList= new ArrayList<>();
        for (int i=0; i<list.size(); i++){
            if ((list.get(i))%2==0){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
    public List<Integer> listSort(List<Integer> list){
        for (int i=0; i<list.size(); i++){
            for (int j=i+1; j<list.size();j++){
                if (list.get(i)>list.get(j)){
                    int temp=list.get(i);
                    list.remove(i);
                    list.add(j, list.get(j-1));
                    list.remove(j);
                    list.add(temp);
                }
            }
        }
        return list;
    }
    public List<Integer> listSortDescending(List<Integer> list){
        for (int i=0; i<list.size(); i++){
            for (int j=i+1; j<list.size();j++){
                if (list.get(i)<list.get(j)){
                    int temp=list.get(i);
                    list.remove(i);
                    list.add(i, list.get(j-1));
                    list.remove(j);
                    list.add(temp);
                }
            }
        }
        return list;
    }
    public List<Integer> listsort2(List<Integer> list) {
        boolean verif = true;
        while (verif) {
            verif = false;
            for (int i = 0; i < (list.size() - 1); i++) {
                if (list.get(i) < list.get(i+1)) {
                    int temp = list.get(i);
                    list.remove(i);
                    list.add(i+1,temp);
                    verif=true;
                }
            }
        }
        return list;
    }
}
