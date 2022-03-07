package areaCalculator;

class Rectangle {
    private double lengthA;
    private double lengthB;

    public Rectangle(double lengthA, double lengthB) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }

    public double getLengthA() {
        return lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }
}

class AreaCalculator {

    public void calculateAreaOfRectangle(Rectangle rectangle) {
        double area = rectangle.getLengthA() * rectangle.getLengthB();
        System.out.println("Area of rectangle (" + rectangle.getLengthA() + " x "
                + rectangle.getLengthB() + ") = " + area);
    }
}

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15.2, 22.3);
        AreaCalculator area = new AreaCalculator();
        area.calculateAreaOfRectangle(rectangle);
    }
}
