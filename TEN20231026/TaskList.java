package TEN20231026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskList {
    private final List<Task> taskList;

    public TaskList() {
        taskList = new ArrayList<>();
    }

    public TaskList(List<Task> taskList) {
        if (taskList == null) {
            throw new IllegalArgumentException("Cant be null");
        }
        this.taskList = new ArrayList<>(taskList);
        Collections.sort(this.taskList);
    }

    public void createTask(String text, Prio prio) {
        Task newtask = new Task(text, prio);
        taskList.add(newtask);
        Collections.sort(taskList);
    }

    public void createTask(String text) {
        Task newtask = new Task(text, Prio.MEDIUM);
        taskList.add(newtask);
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(taskList);
    }

    public List<Task> findTask(String searchText) {
        List<Task> result = new ArrayList<>();
        for (Task t : taskList) {
            if (t.getText().contains(searchText)) {
                result.add(t);
            }
        }
        return result;
    }

    public boolean removeTask(Task task) {
        return taskList.remove(task);
    }

}
