package areaCalculator;

public class Triangle implements Shape {

    private double width;
    private double height;

    public Triangle(double width, double height) {
        if (width > 0) {
            this.width = width;
        }
        if (height > 0) {
            this.height = height;
        }
    }

    @Override
    public double calculateArea() {
        return (height * width) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                "}, area=" + String.format("%.2f", calculateArea());
    }
}
