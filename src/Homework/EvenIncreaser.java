package Homework;

import java.util.Arrays;
import java.util.Scanner;
//Câu 2
public class EvenIncreaser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //yêu cầu người dùng nhập số lượng phần tử -> chính là kích thước của mảng ( 1 chiều)
        System.out.println("Nhập số lượng phần tử: ");
        int size = sc.nextInt();      //gán số nguyên được người dùng nhập vào cho biến size (int)
        int[] array = new int[size]; //khai báo mảng có tên array và cấp phát bộ nhớ cho mảng ( độ dài của mảng là giá trị của biến size)
        //nhập từng phần tử trong mảng
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < size; i++) {                  //dùng forloop nhập từng giá trị cho mảng và lưu vào từng ô nhớ của mảng
            System.out.printf("Phần tử thứ %d: ", i + 1);
            array[i] = sc.nextInt();
        }
        //hiện mảng vừa nhập
        System.out.print("Hiện các phần tử của mảng: ");
        System.out.println(Arrays.toString(array)); //sử dụng phương thức toString để in ra mảng dưới dạng chuỗi VD: [1, 2, 3]

        int[] newArray = Arrays.copyOf(array, size); //dùng copyOf copy mảng cũ sang mảng mới (newArray)
        for (int i = 0; i < size; i++) {            // duyệt từng phần tử trong mảng newArray
            newArray[i] = (newArray[i] % 2 == 0) ? newArray[i] + 1 : newArray[i];
        }

        //hiện mảng mới
        System.out.print("Các số chẵn trong mảng tăng lên 1: ");
        System.out.printf("%s -> %s", Arrays.toString(array), Arrays.toString(newArray));
    }
}
