package TEN20221024;

import java.util.ArrayList;
import java.util.List;

public class RecentList<T> implements IRecentList<T> {
    private List<T> list;

    public RecentList() {
        list = new ArrayList<>();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public List<T> getObjects() {
        return new ArrayList<>(list);
    }

    public void add(T obj) {
        list.remove(obj);
        list.add(0, obj);
    }

    public boolean remove(T obj) {
        return list.remove(obj);
    }

    public T get(int index) {
        T obj = list.get(index);
        list.remove(index);
        list.add(0, obj);
        return obj;
    }

    public String toString() {
        return "The objects: " + list;
    }
}