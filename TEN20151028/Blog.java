package TEN20151028;

import java.time.LocalDate;

public class Blog {
    private final String titel;
    private String text;
    private LocalDate date;
    private User user;

    public Blog(String titel, String text, User user) {
        this.titel = titel;
        this.text = text;
        this.date = LocalDate.now();
        user.addtoList(this);
    }

    public String getTitel() {
        return titel;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setText(String newText) {
        LocalDate date1 = LocalDate.now();
        text += newText + "(" + date1 + ")";
    }

    public String toString() {
        return titel + ", Content[" + text + "], Date(" + date + ").";
    }
}