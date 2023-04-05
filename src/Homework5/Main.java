package Homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents;
        System.out.println("Nhập số lượng sinh viên: ");
        do {
            numberOfStudents = Integer.parseInt(sc.nextLine());
            if (numberOfStudents <= 0) {
                System.out.println("Số lượng sinh viên phải lớn hơn 0");
            }
        }while(numberOfStudents <= 0); //kiểm tra số lượng sinh viên phải > 0

        SinhVienTechMaster[] students = new SinhVienTechMaster[numberOfStudents]; //khởi tạo mảng students kích thước là numberOfStudents, các phần tử có kiểu dữ liệu SinhVienTechMaster

        for (int i = 0; i < numberOfStudents; i++) { //duyệt mảng, yêu cầu nhập giá trị cho từng phần tử
            System.out.println("Sinh viên thứ " + (i + 1) );
            SinhVienTechMaster student = enterStudent(sc); //gọi phương thức enterStudent để nhập các thông tin, gán dữ liệu trả về vào biến student
            students[i] = student; //gán dữ liệu trả về cho các phần tử
        }
        for (int i = 0; i < numberOfStudents; i++) { //đưa ra thông tin của từng sinh viên vừa nhập
            System.out.println("Sinh viên thứ " + (i + 1) );
            students[i].xuat();
            System.out.println("---------");
        }
    }



    public static SinhVienTechMaster enterStudent (Scanner sc) {  //phương thức nhập thông tin cho sinh viên trả về kết quả có kiểu dữ liệu SinhVienTechMaster
        int choice;
        String majorOfStudent = "";

        System.out.println("Nhập tên sinh viên: "); //yêu cầu nhập tên sinh viên
        String nameStudent = sc.nextLine();
        do {
            System.out.println("Nhập chuyên ngành: "); //yêu cầu nhập chuyên ngành, giá trị nhập vào (1 hoặc 2)
            System.out.println("1. IT");
            System.out.println("2. Biz");
            choice = Integer.parseInt(sc.nextLine());
            if (choice != 1 && choice != 2) {
                System.out.println("Chỉ nhập 1 hoặc 2");
                System.out.println("Nhập lại");
            } else {
                majorOfStudent = (choice == 1) ? "IT" : "Biz"; //gán giá trị "IT" vào biến majorOfStudent nếu người dùng nhập vào 1, "Biz" nếu người dùng nhập vào 2
            }
        } while (choice != 1 && choice != 2); //kiểm tra giá trị nhập vào, không đúng thì nhập lại

        if (majorOfStudent.equals("IT")) {    //nếu biến majorOfStudent là "IT" yêu cầu người dùng nhập 3 điểm của ngành IT
            double subject1;
            double subject2;
            double subject3;
            do {
                System.out.println("Nhập điểm môn học");
                System.out.println("Điểm java");
                subject1 = Double.parseDouble(sc.nextLine());
                System.out.println("Điểm html");
                subject2 = Double.parseDouble(sc.nextLine());
                System.out.println("Điểm css");
                subject3 = Double.parseDouble(sc.nextLine());
                if ((0 > subject1 || subject1 > 10) || (0 > subject2 || subject2 > 10) || (0 > subject3 || subject3 > 10)) {
                    System.out.println("Điểm mỗi môn trong khoảng (0- 10)");
                    System.out.println("Nhập lại: ");
                }
            } while ((0 > subject1 || subject1 > 10) || (0 > subject2 || subject2 > 10) || (0 > subject3 || subject3 > 10)); //kiểm tra mỗi điểm phải trong khoảng 0- 10 nếu không đúng thì nhập lại
            return new SinhVienIT(nameStudent, majorOfStudent, subject1, subject2, subject3); //trả về kiểu dữ liệu SinhVienTechMaster được khởi tạo qua hàm khởi tạo có tham số của lớp SinhVienIT (kế thừa)
        } else {    //nếu biến majorOfStudent là "Biz" yêu cầu người dùng nhập 2 điểm của ngành Biz
            double subject1;
            double subject2;
            do {
                System.out.println("Nhập điểm môn học");
                System.out.println("Điểm marketing");
                subject1 = Double.parseDouble(sc.nextLine());
                System.out.println("Điểm sales");
                subject2 = Double.parseDouble(sc.nextLine());
                if ((0 > subject1 || subject1 > 10) || (0 > subject2 || subject2 > 10)) {
                    System.out.println("Điểm mỗi môn trong khoảng (0- 10)");
                    System.out.println("Nhập lại: ");
                }
            } while ((0 > subject1 || subject1 > 10) || (0 > subject2 || subject2 > 10));  //kiểm tra mỗi điểm phải trong khoảng 0- 10 nếu không đúng thì nhập lại
            return new SinhVienBiz(nameStudent, majorOfStudent, subject1, subject2); //trả về kiểu dữ liệu SinhVienTechMaster được khởi tạo qua hàm khởi tạo có tham số của lớp SinhVienBiz (kế thừa)
        }
    }
}
