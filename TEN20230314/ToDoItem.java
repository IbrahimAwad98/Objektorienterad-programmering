package TEN20230314;

import java.time.LocalDate;

public class ToDoItem implements Comparable<ToDoItem> {
    private final String title;
    private LocalDate dueDate;

    public ToDoItem(String title, LocalDate dueDate) {
        this.title = title;
        setDueDate(dueDate);
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate newDate) {
        if (newDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Already passed: " + dueDate);
        }
        this.dueDate = newDate;
    }

    public int compareTo(ToDoItem other) {
        int result = this.dueDate.compareTo(other.dueDate);
        if (result == 0) {
            result = this.title.compareTo(other.title);
        }
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToDoItem) || obj == null) {
            return false;
        }
        ToDoItem t = (ToDoItem) obj;
        return this.compareTo(t) == 0;
    }


    public String toString() {
        return title + ", Date: [" + dueDate + "]";
    }
}
