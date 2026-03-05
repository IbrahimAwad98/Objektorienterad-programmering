package Lessons;

public class Student implements Comparable<Student> {
    private String name;
    private int gpa;

    public Student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getGpa() {
        return gpa;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.gpa, other.gpa);
    }

    public String toString() {
        return name + ", gpa= " + gpa;
    }
}