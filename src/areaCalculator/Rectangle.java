package areaCalculator;

import java.util.*;

public class Rectangle implements Shape {

    private double length;
    private double width;
    private double area;

    public Rectangle(double length, double width) {
        if (length > 0) {
            this.length = length;
        }
        if (width > 0) {
            this.width = width;
        }
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public List saveFields() {
        List list = new ArrayList();
        list.add(0, length);
        list.add(1, width);
        list.add(2, area);

        return list;
    }

    @Override
    public void updateField(double area) {
        setArea(area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                '}';
    }
}
