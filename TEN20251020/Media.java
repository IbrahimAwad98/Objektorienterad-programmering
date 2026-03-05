package TEN20251020;

import java.time.LocalDateTime;

public abstract class Media implements Comparable<Media> {
    private final String title;
    private LocalDateTime lastupdate;

    public Media(String title) {
        this.title = title;
        this.lastupdate = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getLastupdate() {
        return lastupdate;
    }

    public void setLastupdateNow() {
        this.lastupdate = LocalDateTime.now();
    }

    public int compareTo(Media other) {
        return this.lastupdate.compareTo(other.getLastupdate());
    }

    public String toString() {
        return title + ", Last Update: " + lastupdate;
    }
}
