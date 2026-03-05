package Lessons;

public class Circle extends Shape {
    private double diameter;

    public Circle(double x, double y, double diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void print() {
        System.out.println("Draw circle with (" + getX() + ", " + getY() + ")");
    }
}