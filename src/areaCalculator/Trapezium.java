package areaCalculator;

public class Trapezium implements Shape {

    private double shortBase;
    private double longBase;
    private double height;

    public Trapezium(double shortBase, double longBase, double height) {
        if (shortBase > 0) {
            this.shortBase = shortBase;
        }
        if (longBase > shortBase) {
            this.longBase = longBase;
        }
        if (height > 0) {
            this.height = height;
        }
    }

    private double area;



    public void setArea(double area) {
        this.area = area;
    }

    public double getLongBase() {
        return longBase;
    }

    public double getShortBase() {
        return shortBase;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }
}