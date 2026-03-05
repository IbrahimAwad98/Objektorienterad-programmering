package TEN20211027;

import java.util.Objects;

public class Triangle implements ITriangle, Comparable<Triangle> {
    private int a, b, c;

    public Triangle(int a, int b, int c) throws IllegalSideException {
        checkSides(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void checkSides(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalSideException("Side < 0");
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalSideException("2 sides < third");
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) throws IllegalSideException {
        checkSides(a, b, c);
        this.a = a;
    }


    public void setB(int b) throws IllegalSideException {
        checkSides(a, b, c);
        this.b = b;
    }

    public void setC(int c) throws IllegalSideException {
        checkSides(a, b, c);
        this.c = c;
    }

    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public int compareTo(Triangle other) {
        return Double.compare(this.getA(), other.getArea());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triangle)) {
            return false;
        }
        Triangle t = (Triangle) obj;
        return this.a == t.a && this.b == t.b && this.c == t.c;
    }

    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public String toString() {
        return "(" + a + ", " + b + ", " + c + ")";
    }
}