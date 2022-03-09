package areaCalculator;

public class Rectangle {

        private double length;
        private double width;

        public Rectangle(double length, double width) {
            if (length > 0) {
                this.length = length;
            }
            if (width > 0) {
                this.width = width;
            }
        }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }
    }
