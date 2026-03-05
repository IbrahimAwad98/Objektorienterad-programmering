package TEN20241021;

public class Circle extends AShape {
    private int radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(Point point, Color color, int radius) {
        super(point, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void draw() {
        System.out.println("Circle at " + getPoint()
                + ", Color=" + getColor()
                + ", radius=" + getRadius());
    }
}