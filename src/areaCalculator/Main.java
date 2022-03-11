package areaCalculator;

public class Main {

    public static void main(String[] args) {
        Shape firstShape = new Rectangle(3, 22.3);
        Shape secondShape = new Circle(22.5);

        AreaCalculator myCalculator = new AreaCalculator();
        myCalculator.addShapeToList(firstShape);
        myCalculator.addShapeToList(secondShape);

        myCalculator.calculateArea(myCalculator.getShapeList());
    }
}
