package Exercise3;

/**
 * Clase círculo
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Circle {
    private static final double PI = Math.PI;
    private Double radius;

    /**
     * Constructor
     *
     * @param radius
     */
    public Circle(Double radius) {
        this.radius = radius;
    }

    /**
     * Método para hallar el área del circulo
     *
     * @return area
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public double area() {
        double area = PI * Math.pow(radius, 2);
        return area;
    }
}
