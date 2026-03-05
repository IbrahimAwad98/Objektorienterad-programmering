package Lessons;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T>{
    private ArrayList<T> arrayList;

    public Stack(){
        arrayList = new ArrayList<>();
    }

    public void push(T item){
        arrayList.add(item);
    }

    public boolean isEmpty(){
        return arrayList.isEmpty();
    }

    public T peek(){
        if (arrayList.isEmpty()){
            throw new EmptyStackException();
        }
        return arrayList.getLast();
    }

    public T pop(){
        if (arrayList.isEmpty()){
            throw new EmptyStackException();
        }
        return arrayList.removeLast();
    }

}
