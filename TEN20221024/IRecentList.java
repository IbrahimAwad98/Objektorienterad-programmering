package TEN20221024;

import java.util.List;

public interface IRecentList<T> {
    int size();

    boolean isEmpty();

    List<T> getObjects();

    void add(T obj);

    T get(int index);

    boolean remove(T obj);
}
