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
}
