package Lessons;

public class Buffer {
    private int value;
    private boolean hasValue = false;


    public synchronized void put(int v) throws InterruptedException {
        while (hasValue) {
            wait();
        }
        value = v;
        hasValue = true;
        notify();
    }

    public synchronized int get() throws InterruptedException {
        while (!hasValue) {
            wait();
        }
        hasValue = false;
        notify();
        return value;
    }


    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread producer = new Thread();
        try {
            for (int i = 0; i <= 5; i++) {
                buffer.put(i);
                System.out.println("Lade in: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Thread consumer = new Thread();
        try {
            for (int i = 0; i <= 5; i++) {
                int v = buffer.get();
                System.out.println("get: " + v);
            }
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        producer.start();
        consumer.start();
    }
}
