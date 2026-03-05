package TEN20151028;

public class Book extends Media {
    private String author;
    private String ISBN;

    public Book(String title, Genre genre, String author, String ISBN) {
        super(title, genre);
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String toString() {
        return super.toString() + "Author: " + author + ", ISBN [" + ISBN + "]";
    }
}