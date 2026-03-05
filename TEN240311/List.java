package TEN240311;

public class List<E> implements IList<E> {
    private E[] elements;
    private int n;

    public List() {
        this(10);
    }

    public List(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("capacity: " + initialCapacity);
        }
        elements = (E[]) new Object[initialCapacity];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void addLast(E element) {
        if (n >= elements.length) {
            ensure();
        }
        elements[n++] = element;
    }

    private void ensure() {
        E[] copy = (E[]) new Object[elements.length * 2];
        for (int i = 0; i < n; i++) {
            copy[i] = elements[i];
        }
        elements = copy;
    }

    public void clear() {
        for (int i = 0; i < n; i++) {
            elements[i] = null;
        }
        n = 0;
    }

    public E get(int index) {
        if (index < 0 || index >= n) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        return elements[index];
    }

    public IList<E> copy() {
        List<E> result = new List<>(n * 2);
        for (int i = 0; i < n; i++) {
            result.addLast(elements[i]);
        }
        return result;
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