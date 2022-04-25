package Exercise3;

public class Circle {
    private static final double PI = Math.PI;
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public double area() {
        double area = PI * Math.pow(radius, 2);
        return area;
    }
}
