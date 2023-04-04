package Homework4_Cau1;

public abstract class Geometry {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    //(* tìm hiểu thêm)
    //abstract là keyword định nghĩa lớp hoặc phương thức trừu tượng
    //lớp trừu tượng (chỉ định nghĩa, không khởi tạo) phải được kế thừa qua các lớp con
    //method trừu tượng không có thân, được triển khai qua các method của lớp con (override)
}
