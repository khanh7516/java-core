package Homework;

import java.util.Arrays;
import java.util.Scanner;
//Câu 3
public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //yêu cầu người dùng nhập số lượng phần tử -> chính là kích thước của mảng ( 1 chiều)
        System.out.println("Nhập số lượng phần tử: ");
        int size = sc.nextInt();      //gán số nguyên được người dùng nhập vào cho biến size (int)
        int[] array = new int[size]; //khai báo mảng có tên array và cấp phát bộ nhớ cho mảng ( độ dài của mảng là giá trị của biến size)

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < size; i++) {                  //dùng forloop nhập từng giá trị cho mảng và lưu vào từng ô nhớ của mảng
            System.out.printf("Phần tử thứ %d: ", i + 1);
            array[i] = sc.nextInt();
        }
        //hiện mảng vừa nhập
        System.out.print("Hiện các phần tử của mảng: ");
        System.out.println(Arrays.toString(array)); //dùng method toString để in ra mảng dưới dạng chuỗi VD: [1, 2, 3]

        //Sử dụng 2 để tìm max và min trong 1 mảng
        //Cách 1: Dùng lớp Array và phương thức sort
        int[] arrCopy = Arrays.copyOf(array, size); //dùng copyOf copy mảng cũ (array) sang mảng mới (arrCopy) để khi dùng sort trật tự mảng cũ không đổi
        Arrays.sort(arrCopy); //dùng method sort để sắp xếp các phần tử của mảng arrCopy theo giá trị tăng dần của các phần tử
        int max = arrCopy[size -1];  //phần tử lớn nhất là phần tử cuối cùng của mảng được sắp xếp tăng dần
        int min = arrCopy[0];       //phần tử nhỏ nhất là phần tử đầu tiên của mảng được sắp xếp tăng dần

        //Cách 2: Dùng forloop duyệt từng phần tử trong mảng
        int maxE = array[0]; //khai báo biến maxE và minE (int) và gán cho 2 biến giá trị đầu tiên của mảng (array[0])
        int minE = array[0];
        for (int i = 1; i < size; i++) { //duyệt các phần tử trong mảng bắt đầu từ phần tử có index = 1 tới phần tử cuối cùng
            maxE = Math.max(maxE, array[i]); //tìm giá trị lớn nhất giữa biến maxE và phần tử được duyệt, gán lại kết quả mới vào maxE
            minE = Math.min(minE, array[i]); //tìm giá trị nhỏ nhất giữa biến minE và phần tử được duyệt, gán lại kết quả mới vào minE
        } //sau khi kết thúc vòng lặp -> toàn bộ phần tử trong mảng được duyệt -> 2 biến maxE và minE đã có giá trị là phần tử lớn nhất, phần tử nhỏ nhất trong mảng

        //in ra phần tử lớn nhất và nhỏ nhất của mảng được nhập theo 2 cách
        System.out.println("Cách 1: ");
        System.out.printf("Số lớn nhất trong mảng: %d %n", max);
        System.out.printf("Số nhỏ nhất trong mảng: %d %n", min);
        System.out.println("Cách 2: ");
        System.out.printf("Số lớn nhất trong mảng: %d %n", maxE);
        System.out.printf("Số nhỏ nhất trong mảng: %d", minE);
    }
}
