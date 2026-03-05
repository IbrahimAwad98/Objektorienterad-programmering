package TEN20220314;

public class Queue<E> {
    private E[] elements;
    private int n;
    private int front, rear;


    public Queue() {
        this(10);
    }

    public Queue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Cant be negativ: " + capacity);
        }
        elements = (E[]) new Object[capacity];
        front = 0;
        rear = 0;
        n = 0;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void enqueue(E element) {
        if (n >= elements.length) {
            ensure();
        }
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        n++;
    }

    private void ensure() {
        E[] copy = (E[]) new Object[elements.length * 2];
        for (int i = 0; i < n; i++) {
            copy[i] = elements[(front + i) % elements.length];
        }
        elements = copy;
        front = 0;
        rear = n;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        E toRemove = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        n--;
        return toRemove;
    }


    public Object[] getAll() {
        Object[] copy = (E[]) new Object[n];
        for (int i = 0; i < n; i++) {
            copy[i] = elements[(front + i) % elements.length];
        }
        return copy;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < n; i++) {
            sb.append(elements[(front + i) % elements.length]);
            if (i < n - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}