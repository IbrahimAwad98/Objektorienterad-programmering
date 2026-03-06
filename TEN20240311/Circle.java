package TEN240311;

public class Circle implements GraphicsObj {
    private double x, y, radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public boolean isInside(double x, double y) {
        return ((x - this.x) *
                (x - this.x) + (y - this.y) *
                (y - this.y) < radius * radius);
    }

    public String toString() {
        return "Circle (" + x + ", " + y + "), Radius= " + radius;
    }
}