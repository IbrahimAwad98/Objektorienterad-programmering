package TEN20230314;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private final ArrayList<ToDoItem> list;

    public ToDoList() {
        list = new ArrayList<>();
    }

    public int size() {
        return list.size();
    }

    public ArrayList<ToDoItem> getList() {
        return new ArrayList<>(list);
    }

    public void addToDo(String title, LocalDate dueDate) {
        ToDoItem item = new ToDoItem(title, dueDate);
        list.add(item);
    }

    public ToDoItem removeNextToDo() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.removeFirst();
    }


    public void postponeNextToDo(LocalDate newDueDate) {
        ToDoItem toDoItem = this.removeNextToDo();
        toDoItem.setDueDate(newDueDate);
        list.add(toDoItem);
    }

    public String toString() {
        return list.toString();
    }
}
