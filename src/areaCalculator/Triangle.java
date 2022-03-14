package areaCalculator;

public class Triangle implements Shape {

    private double width;
    private double height;
    private double area;

    public Triangle(double width, double height) {
        if (width > 0) {
            this.width = width;
        }
        if (height > 0) {
            this.height = height;
        }
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }
}
