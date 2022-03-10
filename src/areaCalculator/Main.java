package areaCalculator;

public class Main {

    public static void main(String[] args) {
        AreaCalculator myCalculator = new AreaCalculator();
        Rectangle rectangle = new Rectangle(-8, 22.3);
        double area = myCalculator.calculateAreaOfRectangle(rectangle);
    }
}
