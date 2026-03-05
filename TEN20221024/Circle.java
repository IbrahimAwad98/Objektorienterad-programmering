package TEN20221024;

public class Circle extends Shape {
    private int diameter;

    public Circle(Point position, Colors colors, int diameter) {
        super(position, colors);
        if (diameter < 0) {
            throw new IllegalArgumentException("Cant be: " + diameter);
        }
        this.diameter = diameter;
    }


    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int newDiameter) {
        if (newDiameter < 0) {
            throw new IllegalArgumentException("Cant be: " + diameter);
        }
        this.diameter = newDiameter;
    }

    public void paint() {
        System.out.println("Circle: " + getPoistion() + ", " + diameter + ", " + getColors());
    }

    public String toString() {
        return "Circle: " + super.toString() + ", " + diameter;
    }

}
