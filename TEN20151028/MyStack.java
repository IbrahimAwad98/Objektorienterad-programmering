package TEN20151028;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyStack<E> implements Iterable<E> {
    private E[] elements;
    private int nrOfelements;

    public MyStack() {
        elements = (E[]) new Object[10];
        nrOfelements = 0;
    }

    public MyStack(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Cant be negativ");
        }
        elements = (E[]) new Object[capacity];
        nrOfelements = 0;
    }

    public int size() {
        return nrOfelements;
    }

    public boolean empty() {
        return nrOfelements == 0;
    }

    public void push(E item) {
        if (nrOfelements >= elements.length) {
            ensure();
        }
        elements[nrOfelements++] = item;
    }

    public E peek() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[nrOfelements - 1];
    }

    public E pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        E top = elements[nrOfelements - 1];
        elements[nrOfelements - 1] = null;
        nrOfelements--;
        return top;
    }

    private void ensure() {
        E[] copy = (E[]) new Object[nrOfelements * 2];
        for (int i = 0; i < nrOfelements; i++) {
            copy[i] = elements[i];
        }
        elements = copy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = size() - 1; i >= 0; i--) {
            sb.append(elements[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<E> {
        private int current = nrOfelements - 1;

        public boolean hasNext() {
            return current >= 0;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements[current--];
        }

    }

}