package areaCalculator;

public class Circle implements Shape {

    private double radius;
    private double area;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }
}
