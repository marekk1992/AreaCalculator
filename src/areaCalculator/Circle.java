package areaCalculator;

import java.util.ArrayList;
import java.util.List;

public class Circle implements Shape {

    private double diameter;
    private double area;

    public Circle(double diameter) {
        if (diameter > 0) {
            this.diameter = diameter;
        }
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public List saveFields() {
        List list = new ArrayList();
        list.add(0, diameter);
        list.add(1, area);

        return list;
    }

    @Override
    public void updateField(double area) {
        setArea(area);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                ", area=" + area +
                '}';
    }
}
