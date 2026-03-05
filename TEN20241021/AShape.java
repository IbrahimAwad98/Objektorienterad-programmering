package TEN20241021;

public abstract class AShape implements IShape {
    private Point point;
    private Color color;

    public AShape() {
        point = new Point(0, 0);
        color = Color.RED;
    }

    public AShape(Point point, Color color) {
        this.point = point;
        this.color = color;
    }

    public Point getPoint() {
        return point;
    }

    public Color getColor() {
        return color;
    }

    public void move(int dx, int dy) {
        point = new Point(point.x() + dx, point.y() + dy);
    }
}