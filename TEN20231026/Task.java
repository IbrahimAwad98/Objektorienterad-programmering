package TEN20231026;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
    private String text;
    private Prio prio;
    private LocalDate lastUpdate;

    public Task(String text, Prio prio) {
        this.text = text;
        this.prio = prio;
        this.lastUpdate = LocalDate.now();
    }

    public String getText() {
        return text;
    }

    public Prio getPrio() {
        return prio;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public void appendText(String add) {
        this.text += add;
        this.lastUpdate = LocalDate.now();
    }

    public void setPrio(Prio newPrio) {
        this.prio = newPrio;
        this.lastUpdate = LocalDate.now();
    }

    public int compareTo(Task other) {
        int result = this.prio.compareTo(other.prio);
        if (result == 0) {
            result = this.text.compareTo(other.text);
        }
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Task)) {
            return false;
        }
        Task t = (Task) obj;
        return this.prio == t.prio && this.text.equals(t.text);
    }

    public String toString() {
        return "Task: " + text + ", Prio: " + prio + ", Updated [" + lastUpdate + "].";
    }
}