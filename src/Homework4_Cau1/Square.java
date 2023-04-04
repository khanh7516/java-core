package Homework4_Cau1;

public class Square extends Geometry {
    private double side;

    public Square(double side) {
        if (side > 0)               //kiểm tra cạnh hình vuông phải > 0
            this.side = side;
        else System.out.println("Side must be greater than 0");
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0)
            this.side = side;
        else System.out.println("Side must be greater than 0");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
