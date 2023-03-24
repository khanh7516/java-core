package Homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn nhập tên hàng nhập kho:");
        String productName = sc.nextLine();

        System.out.println("Mời bạn nhập ngày tháng năm sinh (yyyy/MM/dd):");
        String birthday = sc.nextLine();
        LocalDate birthdayFomatted = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        System.out.println("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd HH:mm:ss):");
        String arrivalTime = sc.nextLine();
        LocalDateTime arrivalTimeFomatted = LocalDateTime.parse(arrivalTime, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

        System.out.println("Mời bạn nhập thời gian (HH:mm:ss):");
        String time = sc.nextLine();
        LocalTime timeFormatted = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));;

        System.out.println("Tên hàng nhập kho: " + productName);
        System.out.println("Ngày tháng năm sinh: " + birthdayFomatted);
        System.out.println("Thời gian nhập hàng: " + arrivalTimeFomatted);
        System.out.println("Thời gian: " + timeFormatted);
    }
}
