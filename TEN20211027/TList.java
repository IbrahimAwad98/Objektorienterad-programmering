package TEN20211027;

public class TList<T> implements IList<T> {
    private T[] elements;
    private int n;

    public TList() {
        elements = (T[]) new Object[10];
        n = 0;
    }

    public int size() {
        return n;
    }

    public void add(T obj) {
        if (n >= elements.length) {
            ensureCapacity();
        }
        elements[n++] = obj;
    }

    private void ensureCapacity() {
        T[] copy = (T[]) new Object[elements.length * 2];
        for (int i = 0; i < n; i++) {
            copy[i] = elements[i];
        }
        elements = copy;
    }

    public void addAll(IList<T> objects) {
        for (int i = 0; i < objects.size(); i++) {
            add(objects.get(i));
        }
    }

    public boolean contains(T obj) {
        for (int i = 0; i < n; i++) {
            if (obj.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public T get(int index) {
        if (index < 0 || index >= n) {
            throw new IllegalArgumentException("Index: " + index);
        }
        return elements[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= n) {
            throw new IllegalArgumentException("Index: " + index);
        }
        T toRemove = elements[index];
        pack(index);
        return toRemove;
    }

    private void pack(int index) {
        for (int i = index; i < n - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[n - 1] = null;
        n--;
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
