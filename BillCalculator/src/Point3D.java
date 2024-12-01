import java.lang.Math;

class Point3D {
    private double x, y, z;

    // Constructor to initialize the coordinates
    Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Method to calculate the distance from origin
    double distance() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}

class PointApp {
    public static void main(String[] args) {
        // Create two Point3D objects
        Point3D point1 = new Point3D(3.0, 4.0, 5.0);
        Point3D point2 = new Point3D(1.0, 2.0, 3.0);

        // Calculate and display the distances to the origin
        System.out.println("Distance of point1 from origin: " + point1.distance());
        System.out.println("Distance of point2 from origin: " + point2.distance());
    }
}