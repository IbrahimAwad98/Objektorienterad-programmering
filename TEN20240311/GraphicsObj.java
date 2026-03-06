package TEN240311;

public interface GraphicsObj {
    double area();

    void translate(double dx, double dy);

    boolean isInside(double x, double y);
}
