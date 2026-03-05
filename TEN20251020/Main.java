package TEN20251020;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Article a1 = new Article("Football", "Sweden vs Portugal");
        Article a2 = new Article("Tech", "Java 25fx");
        MediaGroup mediaGroup = new MediaGroup();
        mediaGroup.add(a1);
        mediaGroup.add(a2);
        System.out.println(a1.compareTo(a2));
        System.out.println(mediaGroup);
        Article a3 = new Article("Politik", "Ny lag stiftad.");
        System.out.println(a1.compareTo(a3));
        System.out.println(mediaGroup);
         */

        MedicalAssessment medicalAssessment = new MedicalAssessment("ont i halsen", Priority.LOW);
        MedicalAssessment medicalAssessment1 = new MedicalAssessment("HeartAttack", Priority.HIGH);
        MedicalAssessment medicalAssessment2 = new MedicalAssessment("ont i arm", Priority.LOW);
        MedicalAssessment medicalAssessment3 = new MedicalAssessment("headache", Priority.HIGH);

        ErQueue erQueue = new ErQueue();
        System.out.println("Empty? " + erQueue.isEmpty());
        erQueue.enqueue(medicalAssessment);
        erQueue.enqueue(medicalAssessment1);
        erQueue.enqueue(medicalAssessment2);
        erQueue.enqueue(medicalAssessment3);
        System.out.println(erQueue);
        System.out.println("Size= " + erQueue.size());
        System.out.println("Empty? " + erQueue.isEmpty());
        System.out.println("First in queue: " + erQueue.peek());
        ErQueue erQueue1 = new ErQueue();
        try{
            erQueue1.dequeu();
        }catch (IllegalStateException e ){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
