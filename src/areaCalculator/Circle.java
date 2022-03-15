package areaCalculator;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "}, area=" + String.format("%.2f", calculateArea());
    }
}
