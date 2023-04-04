package Homework4_Cau1;

public class Main {
    public static void main(String[] args) {
        //khởi tạo 2 đối tượng rectangle kiểu dữ liệu Rectangle và square kiểu dữ liệu Square bằng hàm khởi tạo có tham số
        Rectangle rectangle = new Rectangle(5, 7);
        Square square = new Square(6);

        //in ra diện tích, chu vi, độ dài các cạnh của 2 hình
        System.out.println("Rectangle:"); //hình chữ nhật
        System.out.println("Length: " + rectangle.getLength()); //chiều dai
        System.out.println("Width: " + rectangle.getWidth());   // chiều rộng
        System.out.println("Area: " + rectangle.calculateArea()); //diện tích
        System.out.println("Perimeter: " + rectangle.calculatePerimeter()); //chu vi

        System.out.println("Square:");   //hình vuông
        System.out.println("Side: " + square.getSide());        //cạnh hình vuông
        System.out.println("Area: " + square.calculateArea());  //diện tích
        System.out.println("Perimeter: " + square.calculatePerimeter()); //chu vi
    }
}