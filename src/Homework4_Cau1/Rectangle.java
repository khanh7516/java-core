package Homework4_Cau1;

public class Rectangle extends Geometry {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        }else System.out.println("Length and width must be greater than 0");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else System.out.println("Length must be greater than 0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else System.out.println("Width must be greater than 0");
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
