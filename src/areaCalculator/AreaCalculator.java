package areaCalculator;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {

    private List<Shape> shapeList;

    public AreaCalculator() {
        shapeList = new ArrayList<>();
    }

    void addShapeToList(Shape shape) {
        shapeList.add(shape);
    }

    public void calculateArea() {
        for (Shape shape : shapeList) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                calculateRectangleArea(rectangle);
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                calculateCircleArea(circle);
            } else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                calculateTriangleArea(triangle);
            } else if (shape instanceof Trapezium) {
                Trapezium trapezium = (Trapezium) shape;
                calculateTrapeziumArea(trapezium);
            }
        }
    }

    private void calculateRectangleArea(Rectangle rectangle) {
        rectangle.setArea(rectangle.getLength() * rectangle.getWidth());
        System.out.println("Rectangle {length=" + rectangle.getLength()
                + ", width=" + rectangle.getWidth()
                + "} area=" + String.format("%.2f", rectangle.getArea()));
    }

    private void calculateCircleArea(Circle circle) {
        circle.setArea(Math.PI * circle.getRadius() * circle.getRadius());
        System.out.println("Circle {radius=" + circle.getRadius()
                + "} area=" + String.format("%.2f", circle.getArea()));
    }

    private void calculateTriangleArea(Triangle triangle) {
        triangle.setArea((triangle.getHeight() * triangle.getWidth()) / 2.0);
        System.out.println("Triangle {height=" + triangle.getHeight()
                + ", width=" + triangle.getWidth() + "} area=" + String.format("%.2f", triangle.getArea()));
    }

    private void calculateTrapeziumArea(Trapezium trapezium) {
        trapezium.setArea(((trapezium.getLongBase() + trapezium.getShortBase()) / 2.0)
                * trapezium.getHeight());
        System.out.println("Trapezium {longBase=" + trapezium.getLongBase()
                + ", shortBase=" + trapezium.getShortBase() + ", height"
                + trapezium.getHeight() + "} area=" + String.format("%.2f", trapezium.getArea()));
    }
}
