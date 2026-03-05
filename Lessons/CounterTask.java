package Lessons;

public class CounterTask implements Runnable {
    private SharedCounter counter;

    public CounterTask(SharedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}