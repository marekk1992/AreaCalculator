package areaCalculator;

public class AreaCalculator {

    public double calculateAreaOfRectangle(Rectangle rectangle) {
        double area = rectangle.getLength() * rectangle.getWidth();
        System.out.println("Area of rectangle (" + rectangle.getLength() + " x "
                + rectangle.getWidth() + ") = " + area);
        return area;
    }
}
