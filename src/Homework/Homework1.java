package Homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sử dụng đối tượng Scanner để nhập dữ liệu từ bàn phím

        System.out.println("Mời bạn nhập tên hàng nhập kho:"); //yêu cầu nhập tên sản phẩm
        //sử dụng phương thức nextLine() => trả về chuỗi ký tự String khi người dùng nhập, sau đó gán chuỗi được nhập vào biến productName
        String productName = sc.nextLine();

        System.out.println("Mời bạn nhập ngày tháng năm sinh (yyyy/MM/dd):"); // yêu cầu nhập ngày tháng năm sinh theo đúng định dạng Năm /Tháng /Ngày
        String birthday = sc.nextLine();
        //chuỗi ký tự sau khi được nhập vào được chuyển đổi sang kiểu dữ liệu LocalDate (object) sau đó được gán vào biến birthdayFomatted
        LocalDate birthdayFomatted = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));  // sử dụng DateTimeFormatter để chỉ định định dạng

        //yêu cầu nhập thời gian nhập hàng theo đúng định dạng Năm /Tháng /Ngày Giờ:Phút:Giây
        System.out.println("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd HH:mm:ss):");
        String arrivalTime = sc.nextLine();
        LocalDateTime arrivalTimeFomatted = LocalDateTime.parse(arrivalTime, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

        //yêu cầu nhập thời gian theo định dạng Giờ:Phút:Giây
        System.out.println("Mời bạn nhập thời gian (HH:mm:ss):");
        String time = sc.nextLine();
        LocalTime timeFormatted = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));;

        //hiển thị các kết quả đã nhập
        System.out.println("Tên hàng nhập kho: " + productName);
        System.out.println("Ngày tháng năm sinh (yyyy/MM/dd): " + birthdayFomatted);
        System.out.println("Thời gian nhập hàng (yyyy/MM/dd HH:mm:ss): " + arrivalTimeFomatted);
        System.out.println("Thời gian (HH:mm:ss): " + timeFormatted);
    }
}
