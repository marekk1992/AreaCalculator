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
            System.out.println(shape);
        }
    }
}
