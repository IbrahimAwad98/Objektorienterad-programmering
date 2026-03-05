package TEN20251020;

public class ErQueue {
    private MedicalAssessment[] queue;
    private int n;

    public ErQueue() {
        queue = new MedicalAssessment[10];
        n = 0;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void enqueue(MedicalAssessment m) {
        if (n >= queue.length) {
            ensure();
        }
        if (m.getPriority() == Priority.LOW) {
            queue[n++] = m;
        } else {
            int position = 0;
            for (int i = 0; i < n; i++) {
                if (queue[i].getPriority() == Priority.HIGH) {
                    position = i + 1;
                }
            }
            for (int i = n; i > position; i--) {
                queue[i] = queue[i - 1];
            }
            queue[position] = m;
            n++;
        }
    }

    public MedicalAssessment peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[0];
    }

    public MedicalAssessment dequeu() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        MedicalAssessment first = queue[0];
        for (int i = 0; i < n - 1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[n - 1] = null;
        n--;
        return first;
    }

    private void ensure() {
        MedicalAssessment[] copy = new MedicalAssessment[queue.length * 2];
        for (int i = 0; i < n; i++) {
            copy[i] = queue[i];
        }
        queue = copy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < n; i++) {
            sb.append(queue[i]);
            if (i < n - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
