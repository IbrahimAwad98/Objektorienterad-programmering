package Lessons;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> titles;

    public Library() {
        titles = new ArrayList<>();
    }


    public List<String> getBooks() {
        return new ArrayList<>(titles);
    }

    public void addBooks(String title) {
        if (titles.contains(title)) {
            throw new IllegalArgumentException("Already exits: " + title);
        }
        titles.add(title);
    }

    public void removeBooks(String title) {
        if (!titles.contains(title)) {
            throw new IllegalArgumentException("Not found: " + title);
        }
        titles.remove(title);
    }

    public String toString() {
        return titles.toString();
    }


    public static void main(String[] args) {
        Library library = new Library();
        library.addBooks("Java");
        library.addBooks("Math");
        library.addBooks("ADT");
        System.out.println(library);
        try {
            library.removeBooks("Formel");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        List<String> books = library.getBooks();
        books.add("Fake book");
        System.out.println(books);

    }
}
