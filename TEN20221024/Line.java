package TEN20221024;

public class Line extends Shape {
    private Point endPoint;

    public Line(Point postion, Colors colors, Point endPoint) {
        super(postion, colors);
        this.endPoint = endPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point newPoint) {
        this.endPoint = newPoint;
    }

    public void paint() {
        System.out.println("Line: " + getPoistion() + ", " + endPoint + ", " + getColors());
    }

    public String toString() {
        return "Line: " + super.toString() + ", " + endPoint;
    }
}