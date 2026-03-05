package TEN20231026;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*

         Task task = new Task("Java", Prio.HIGH);
        Task task1 = new Task("Algoritm", Prio.MEDIUM);
        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(task);
        taskList.add(task1);
        for (Task t: taskList){
            System.out.println(t);
            t.appendText(" Kommentar");
            System.out.println(t);
        }
        System.out.println(task.compareTo(task1)); //1
        System.out.println(task.equals(task1));


         // Skapa en tom lista och lägg till tasks
        TaskList list = new TaskList();
        list.createTask("Fixa buggar i produktionen", Prio.HIGH);
        list.createTask("Skriv dokumentation");           // NORMAL som default
        list.createTask("Uppdatera beroenden", Prio.LOW);
        list.createTask("Fixa enhetstester", Prio.HIGH);

        System.out.println("=== Alla tasks (sorterade) ===");
        System.out.println(list);

        // findTask — sök på delsträng
        System.out.println("=== Sökning på 'Fixa' ===");
        List<Task> hits = list.findTask("Fixa");
        for (Task t : hits) {
            System.out.println(t);
        }
         */

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('H');
        stringBuilder.append('e');
        stringBuilder.append('j');
        System.out.println(stringBuilder);

        StringBuilder stringBuilder1 = new StringBuilder("Java");
        stringBuilder1.append(" + C");
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder1.charAt(3));


    }
}
