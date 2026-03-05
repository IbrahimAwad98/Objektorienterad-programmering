package TEN20250312;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class UList<E> implements Iterable<E> {
    private E[] elements;
    private int n;

    public UList() {
        elements = (E[]) new Object[10];
        n = 0;
    }

    public int size() {
        return n;
    }

    public E get(int index) {
        if (index < 0 || index >= n) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return elements[index];
    }

    public boolean add(E obj) {
        if (n >= elements.length) {
            ensure();
        }
        for (int i = 0; i < n; i++) {
            if (elements[i].equals(obj)) {
                return false;
            }
        }
        elements[n++] = obj;
        return true;
    }

    private void ensure() {
        E[] copy = (E[]) new Object[elements.length * 2];
        for (int i = 0; i < n; i++) {
            copy[i] = elements[i];
        }
        elements = copy;
    }

    public boolean contains(E obj) {
        for (int i = 0; i < n; i++) {
            if (elements[i].equals(obj)) {
                return true;
            }
        }
        return false;
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

    public Iterator<E> iterator() {
        return new UIterator();
    }

    private class UIterator implements Iterator<E> {
        private int pos = 0;

        public boolean hasNext() {
            return pos < n;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements[pos++];
        }
    }
}