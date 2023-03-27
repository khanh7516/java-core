package Homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sử dụng đối tượng Scanner để nhập dữ liệu từ bàn phím
        // khởi tạo các biến có kiểu String, chưa gán giá trị, giá trị mặc định là null
        String name;
        String address;
        String continueChoice;
        // khởi tạo biến age kiểu int, giá trị mặc định là 0
        int age;

        do {
            //yêu cầu nhập tên
            System.out.println("Enter your name: ");
            name = sc.nextLine();
            //yêu cầu nhập địa chỉ
            System.out.println("Enter your address: ");
            address = sc.nextLine();
            //yêu cầu nhập tuổi
            System.out.println("Enter your age: ");
            String ageString = sc.nextLine(); //đọc dữ liệu từ bàn phím, lưu dữ liệu đó vào biến ageString dưới dạng chuỗi (string)
            age = Integer.parseInt(ageString); //chuyển đổi chuỗi (string) thành kiểu số nguyên (integer) rồi lưu vào biến age

            //in ra thông tin đã nhập trước đó
                //printf cho phép định dạng và hiển thị các giá trị khác được chèn vào trong chuỗi
            System.out.printf("Name: %s %n", name);       //%s dùng để hiển thị giá trị kiểu String của biến name và address
            System.out.printf("Address: %s %n", address); //%n dùng để thêm một ký tự xuông dòng (new line)
            System.out.printf("Age: %d %n", age);         //%d được dùng để hiện thị giá trị kiểu int của biến age

            //hỏi người dùng có muốn nhập tiếp hay không
            System.out.println("Do you want to continue? (Y/N)");
            continueChoice = sc.nextLine(); //lưu câu trả lời của người dùng vào biến continueChoice với 2 giá trị (y hoặc n) có kiểu dữ liệu String
        }
        //đối chiếu giá trị nhập vào nếu là y(Y) tiếp tục thực hiện đoạn mã trong vòng lặp do-while
        //nếu không, thoát khỏi vòng lặp do-while
        while (continueChoice.equalsIgnoreCase("Y")); //biểu thức bên trong cặp dấu ngoặc đơn của while trả về giá trị có kiểu boolean (true/ false)
    }
}
