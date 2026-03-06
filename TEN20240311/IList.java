package TEN240311;

public interface IList<E> {
    boolean isEmpty();

    void addLast(E element);

    void clear();

    E get(int index);

    IList<E> copy();
}
