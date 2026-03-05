package TEN20211027;

public interface IList<T> {
    int size();

    void add(T obj);

    void addAll(IList<T> objects);

    boolean contains(T obj);

    T get(int index) throws IndexOutOfBoundsException;

    T remove(int index) throws IndexOutOfBoundsException;
}
