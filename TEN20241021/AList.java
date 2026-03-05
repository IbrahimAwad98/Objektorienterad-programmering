package TEN20241021;

public class AList<E> {
    private E[] elements;
    private int n;

    public AList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        elements = (E[]) new Object[capacity];
        n = 0;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public E get(int index) {
        if (index < 0 || index >= n) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        return elements[index];
    }

    public void add(E obj) {
        if (n >= elements.length) {
            ensure();
        }
        elements[n++] = obj;
    }

    private void ensure() {
        E[] copy = (E[]) new Object[elements.length * 2];
        for (int i = 0; i < n; i++) {
            copy[i] = elements[i];
        }
        elements = copy;
    }

    public void forEach(IConsumer<E> consumer) {
        for (int i = 0; i < n; i++) {
            consumer.apply(elements[i]);
        }
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