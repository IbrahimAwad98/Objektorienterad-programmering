package TEN20230314;

public class AList<T> {
    private T[] elements;
    private int n;

    public AList() {
        this(3);
    }

    public AList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Cant be: " + capacity);
        }
        elements = (T[]) new Object[capacity];
        n = 0;
    }


    public int size() {
        return n;
    }

    public T get(int index) {
        if (index < 0 || index >= n) {
            throw new IndexOutOfBoundsException("Wrong: " + index);
        }
        return elements[index];
    }

    public void add(int index, T obj) {
        if (index < 0 || index > n) {
            throw new IndexOutOfBoundsException("Wrong: " + index);
        }

        if (n >= elements.length) {
            ensure();
        }

        for (int i = n; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = obj;
        n++;
    }

    private void ensure() {
        T[] copy = (T[]) new Object[elements.length * 2];
        for (int i = 0; i < n; i++) {
            copy[i] = elements[i];
        }
        elements = copy;
    }

    public boolean remove(T obj) {
        for (int i = 0; i < n; i++) {
            if (elements[i].equals(obj)) {
                for (int j = i; j < n - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                elements[n - 1] = null;
                n--;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < n; i++) {
            elements[i] = null;
        }
        n = 0;
    }

    public T[] getCopy() {
        T[] copy = (T[]) new Object[n];
        for (int i = 0; i < n; i++) {
            copy[i] = elements[i];
        }
        return copy;
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
