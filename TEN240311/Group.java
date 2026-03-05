package TEN240311;

import java.util.ArrayList;
import java.util.List;

public class Group implements GraphicsObj {
    private List<GraphicsObj> objects = new ArrayList<>();

    public boolean add(GraphicsObj obj) {
        if (obj == this) {
            return false;
        }
        objects.add(obj);
        return true;
    }

    public void remove(double x, double y) {
        for (GraphicsObj go : objects) {
            if (go.isInside(x, y)) {
                objects.remove(go);
            }
        }
    }

    public double area() {
        double area = 0;
        for (GraphicsObj go : objects) {
            area += go.area();
        }
        return area;
    }

    public void translate(double dx, double dy) {
        for (GraphicsObj go : objects) {
            go.translate(dx, dy);
        }
    }

    public boolean isInside(double x, double y) {
        for (GraphicsObj go : objects) {
            if (go.isInside(x, y)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Groups: " + objects.toString();
    }
}
