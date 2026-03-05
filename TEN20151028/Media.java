package TEN20151028;

public abstract class Media {
     private Genre genre;
     private String title;

     public Media(String title, Genre genre){
         this.title = title;
         this.genre = genre;
     }

     public Genre getGenre(){
         return genre;
     }

     public String getTitle(){
         return title;
     }

     public String toString(){
         return title + "Type: " + genre;
     }
}