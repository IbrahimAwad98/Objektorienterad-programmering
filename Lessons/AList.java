package Lessons;

public class AList<E> {
    private E[] elements;
    private int n;

    public AList() {
        this(10);
    }

    public AList(int capacity) {
        elements = (E[]) new Object[capacity];
        n = 0;
    }

    public void add(E obj) {
        if (n >= elements.length) {
            ensure();
        }
        elements[n++] = obj; //lägger sists
    }

    private void ensure() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, n);
        elements = (E[]) newArray;
    }

    public void add(E obj, int index) {
        if (n >= elements.length) {
            ensure();
        }
        //här måste flytta element från slutet
        for (int i = n; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = obj;
        n++;
    }

    public E remove(int index) {
        E toRemove = elements[index];

        for (int i = index; i < n - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[n - 1] = null;
        n--;
        return toRemove;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < n; i++) {
            sb.append(elements[i]);
            if (i < n - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}