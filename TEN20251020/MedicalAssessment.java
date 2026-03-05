package TEN20251020;

public class MedicalAssessment {
    private final String description;
    private final Priority priority;

    public MedicalAssessment(String description, Priority priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }


    public String toString() {
        return description + ", Prio: " + priority;
    }

}
