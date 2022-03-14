package areaCalculator;

public class Main {

    public static void main(String[] args) {
        Shape firstShape = new Rectangle(3, 22.3);
        Shape secondShape = new Circle(22.5);
        Shape thirdShape = new Rectangle(10, 6.5);
        Shape fourthShape = new Triangle(5.35, 3);
        Shape fifthShape = new Trapezium(5, 8.25, 4);

        AreaCalculator myCalculator = new AreaCalculator();
        myCalculator.addShapeToList(firstShape);
        myCalculator.addShapeToList(secondShape);
        myCalculator.addShapeToList(thirdShape);
        myCalculator.addShapeToList(fourthShape);
        myCalculator.addShapeToList(fifthShape);

        myCalculator.calculateArea();
    }
}
