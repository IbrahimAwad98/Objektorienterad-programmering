package TEN20151028;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        List<Media> collections = new ArrayList<>();
        collections.add(new Book("OOP", Genre.SCIENCE,"Anders", "123123124334"));
        collections.add(new Movie("GodFather", Genre.DRAMA, "Tarantino", 200));

        for (Media m: collections){
            if (m instanceof Book){
                Book b = (Book) m;
                System.out.println(b.getAuthor());
            }
        }
         */


        MyStack<String> myStack = new MyStack<>(10);
        System.out.println("is it empty? " + myStack.empty());
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        System.out.println(myStack);
        System.out.println("Size of stack = " + myStack.size());
        System.out.println("Last item: " + myStack.peek());
        System.out.println("pop last item: " + myStack.pop());
        System.out.println(myStack);

        MyStack<String> stack = new MyStack<>(5);
        stack.push("Java");
        stack.push("C");
        stack.push("C++");
        stack.push("Python");
        stack.push("Assembly");
        for (String s: stack){
            System.out.println(s);
        }
    }
}
