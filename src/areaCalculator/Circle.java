package areaCalculator;

public class Circle implements Shape {

    private double diameter;
    private double area;

    public Circle(double diameter) {
        if (diameter > 0) {
            this.diameter = diameter;
        }
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}
