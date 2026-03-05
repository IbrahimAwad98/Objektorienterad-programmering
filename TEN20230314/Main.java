package TEN20230314;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Person ibrahim = new Person("Ibrahim", 1998, Gender.MALE);
        Car car = new Car(ibrahim, "LLS794", Color.BLACK, 4);
        Motorcycle motorcycle = new Motorcycle(ibrahim, "GHW123", Color.RED, false);

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(car);
        vehicleList.add(motorcycle);
        for (Vehicle v : vehicleList) {
            System.out.println(v);
            System.out.println(v.getLicenseClass());
        }
         */

        /*

        ToDoList toDoList = new ToDoList();
        toDoList.addToDo("Java", LocalDate.of(2027, 10, 1));
        toDoList.addToDo("Math", LocalDate.of(2030, 11, 12));
        System.out.println(toDoList);
        System.out.println("Size= " + toDoList.size());
        toDoList.removeNextToDo();
        System.out.println(toDoList);
        System.out.println("Size= " + toDoList.size());
        toDoList.postponeNextToDo(LocalDate.of(2028, 12, 12));
        System.out.println(toDoList);
        try {
            toDoList.addToDo("ADT", LocalDate.of(2000, 3, 4));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
         */

        /*
        AList<String> stringAList = new AList<>();
        stringAList.add(0,"A");
        stringAList.add(1,"B");
        stringAList.add(2, "C");
        System.out.println(stringAList);
        System.out.println("Size= " + stringAList.size());
        stringAList.add(3,"D");
        System.out.println(stringAList);
        System.out.println("Size= " + stringAList.size());
        stringAList.remove("D");
        System.out.println(stringAList);
        System.out.println("Size= " + stringAList.size());
        //stringAList.clear();
        System.out.println(stringAList);
        System.out.println("Size= " + stringAList.size());
        try {
            stringAList.add(-1,"A");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error " + e.getMessage());
        }
        Object[] copy = stringAList.getCopy();
        for (Object o: copy){
            System.out.println(o);
        }
         */


    }
}
