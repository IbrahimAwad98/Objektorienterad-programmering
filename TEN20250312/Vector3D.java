package TEN20250312;

public class Vector3D {
    private final double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(double[] values) {
        if (values.length != 3) {
            throw new IllegalArgumentException("Must be at least 3");
        }
        this.x = values[0];
        this.y = values[1];
        this.z = values[2];
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double[] getValues() {
        return new double[]{x, y, z};
    }

    public double get(Index index) {
        switch (index) {
            case X:
                return x;
            case Y:
                return y;
            case Z:
                return z;
            default:
                throw new IllegalArgumentException("Wrong index");
        }
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static Vector3D add(Vector3D a, Vector3D b) {
        return new Vector3D(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public Vector3D add(Vector3D other) {
        return Vector3D.add(this, other);
    }

    public String toString() {
        return "[" + x + ", " + y + ", " + z + "]";
    }
}
