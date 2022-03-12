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
                calculateRectangleArea(shape);
            }
            if (shape instanceof Circle) {
                calculateCircleArea(shape);
            }
        }
    }

    private void calculateRectangleArea(Shape shape) {
        ((Rectangle) shape).setArea(((Rectangle) shape).getLength()
                * ((Rectangle) shape).getWidth());
        System.out.println("Rectangle {length=" + ((Rectangle) shape).getLength()
                + ", width=" + ((Rectangle) shape).getWidth()
                + "} area=" + String.format("%.2f", ((Rectangle) shape).getArea()));
    }

    private void calculateCircleArea(Shape shape) {
        double radius = ((Circle) shape).getDiameter() / 2.00;
        ((Circle) shape).setArea(Math.PI * radius * radius);
        System.out.println("Circle {diameter=" + ((Circle) shape).getDiameter()
                + "} area=" + String.format("%.2f", ((Circle) shape).getArea()));
    }
}
