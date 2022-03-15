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

    @Override
    public double calculateArea() {
        return ((longBase + shortBase) / 2) * height;
    }

    @Override
    public String toString() {
        return "Trapezium{" +
                "shortBase=" + shortBase +
                ", longBase=" + longBase +
                ", height=" + height +
                "}, area=" + String.format("%.2f", calculateArea());
    }
}