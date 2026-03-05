package Lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*
         BankAccount bankAccount = new BankAccount(5000);
        System.out.println(bankAccount);
        System.out.println("Your balance is: " + bankAccount.getBalance());
        try {
            bankAccount.deposite(-11);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        bankAccount.deposite(100.5);
        System.out.println(bankAccount);
        try {
            bankAccount.withDraw(6000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        bankAccount.withDraw(500);
        System.out.println(bankAccount);
        SavingsAccount savingsAccount = new SavingsAccount(5000, 0.03);
        System.out.println(savingsAccount);
        savingsAccount.addInterest();
        System.out.println(savingsAccount);
        BankAccount bankAccount1 = new BankAccount(5000);
        System.out.println("Balance: " + bankAccount1.describe());
        try {
            bankAccount1.withDraw(6000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
         */


        /*
         // polymorfism
        Shape shape = new Circle(10, 20, 5);
        shape.print();

        //ärv, polymorfism och dynamisk bindning
        Animal a1 = new Animal("Dino", 6);
        System.out.println(a1);
        Animal dog = new Dog("Alex", 5, "Labrador");
        Animal cat = new Cat("Whisa", 1);
        System.out.println(dog);
        System.out.println(cat);
        dog.makeSound();
        cat.makeSound();
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog("Diano", 5, "Lavo"));
        animalList.add(new Cat("Alexa", 1));
        animalList.add(new Dog("Bella", 6, "Pudel"));
        for (Animal a : animalList) {
            a.makeSound();
        }
         */


        //generics
        /*
        Pair<String, Integer> pair = new Pair<>("Alice", 26);
        System.out.println(pair);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        List<Student> studentArrays = new ArrayList<>();
        studentArrays.add(new Student("Ibrahim", 106));
        studentArrays.add(new Student("Hamza", 98));
        studentArrays.add(new Student("Alice", 30));
        System.out.println(studentArrays);
        Collections.sort(studentArrays);
        System.out.println(studentArrays);
        Student student = new Student("Dany", 13);
        Student student1 = new Student("Ahmed", 15);
        System.out.println(student1.compareTo(student));
         */

        /*

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(40);
        integerList.add(50);
        System.out.println("Sum= " + sum(integerList));

        List<String> strings = new ArrayList<>();
        strings.add("Dan");
        strings.add("Dany");
        strings.add("ibb");
        strings.add("Test");
        System.out.println(filterLong(strings));

         */

        /*

        SharedCounter sharedCounter = new SharedCounter();
        Thread t1 = new Thread(new CounterTask(sharedCounter));
        Thread t2 = new Thread(new CounterTask(sharedCounter));
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Result: " + sharedCounter.getCount());
         */


        //iterator
        /*
         List list = new ArrayList<>();
        list.add("Hej");
        list.add("World");
        for (Object s: list){
            System.out.println(s);
        }
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
         */

        /*
        // Record
        Point p1 = new Point(3,5);
        System.out.println(p1);
        Point p2 = new Point(3,5);
        System.out.println(p1.equals(p2));
         */


    }

    /*
     public static int sum(List<Integer> numbers) {
        int sum = 0;
        for (Integer n : numbers) {
            sum += n;
        }
        return sum;
    }

    public static List<String> filterLong(List<String> words) {
        List<String> copy = new ArrayList<>();
        for (String w : words) {
            if (w.length() > 3) {
                copy.add(w);
            }
        }
        return copy;
    }
     */

}