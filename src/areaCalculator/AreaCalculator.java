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

    public void calculateArea(List<Shape> list) {
        for (Shape shape : list) {
            String typeOfShape = shape.getClass().getSimpleName();
            List listOfFields = shape.saveFields();
            switch (typeOfShape) {
                case "Rectangle":
                    double area = areaOfRectangle(listOfFields);
                    shape.updateField(area);
                    System.out.println("Rectangle area = " + area);
                    break;
                case "Circle":
                    area = areaOfCircle(listOfFields);
                    shape.updateField(area);
                    System.out.println("Circle area = " + area);
                    break;
            }
        }
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }

    private double areaOfRectangle(List listOfFields) {
        return Double.parseDouble(listOfFields.get(0).toString())
                * Double.parseDouble(listOfFields.get(1).toString());
    }

    private double areaOfCircle(List listOfFields) {
        double radius = Double.parseDouble(listOfFields.get(0).toString()) / 2.00;
        return Math.PI * radius * radius;
    }
}
