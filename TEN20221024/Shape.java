package TEN20221024;

public abstract class Shape {
    private Point poistion;
    private Colors colors;

    public Shape(Point poistion, Colors colors) {
        this.poistion = poistion;
        this.colors = colors;
    }

    public Point getPoistion() {
        return poistion;
    }

    public Colors getColors() {
        return colors;
    }

    public abstract void paint();

    public String toString() {
        return getPoistion() + ", " + getColors();
    }
}
