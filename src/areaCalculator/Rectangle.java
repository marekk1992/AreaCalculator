package areaCalculator;

public class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length > 0) {
            this.length = length;
        }
        if (width > 0) {
            this.width = width;
        }
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "}, area=" + String.format("%.2f", calculateArea());
    }
}
