package Lessons;

import java.util.ArrayList;
import java.util.List;

public class SortedList<T extends Sortable> {
    private List<T> list;

    public SortedList() {
        list = new ArrayList<>();
    }

    public void add(T item) {
        for (int i = 0; i < list.size(); i++) {
            if (item.getValue() < list.get(i).getValue()){
                list.add(i,item);
                return;
            }
        }
        list.add(item);
    }

    public String toString(){
        return list.toString();
    }


    public T get(int index){
        return list.get(index);
    }


    public int size(){
        return list.size();
    }


    public static void main(String[] args){




    }

}
