package areaCalculator;

public class Rectangle implements Shape {

    private double length;
    private double width;
    private double area;

    public Rectangle(double length, double width) {
        if (length > 0) {
            this.length = length;
        }
        if (width > 0) {
            this.width = width;
        }
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return area;
    }
}
