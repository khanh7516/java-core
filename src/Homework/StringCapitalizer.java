package Homework;

import java.util.Scanner;
//Câu 1:
public class StringCapitalizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //yêu cầu nhập họ tên (String)
        System.out.println("Nhập họ và tên: ");
        String aString = sc.nextLine(); //gán chuỗi vừa nhập vào biến aString ( VD: "ngô gia khánh")

        String[] words = aString.split(" ");  //dùng method split của lớp String để tách chuỗi (aString) thành các phần tử rồi lưu vào mảng words (các phần tử có kiểu String)
                                                        //với split(" ") -> khi gặp khoảng trắng split sẽ tự tách chuỗi thảnh phần tử mới rồi đưa vào mảng
                                                            //VD "ngô gia khánh" -> ["ngô", "gia", "khánh"]
        String newStr = "";   //khởi tạo một biến newStr kiểu String, gán giá trị "" (một chuỗi trống)

        for (String word: words) { //dùng forloop duyệt từng phần tử (word) trong mảng words (word có kiểu String) (VD với phần tử đầu tiên: word = "ngô")
            String wordCapitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase(); //dùng method substring tách word thành 2 phần: chữ cái đầu (substring(0, 1) và các chữ cái còn lại (substring(1))
                                                                                                                //chữ cái đầu được viết hoa (toUpperCase) các chữ cái còn lại viết thường (toLowerCase) sau đó cộng 2 chuỗi lại lưu vào biến mới
                                                                                                                    //VD: "ngô" -> "N" + "gô" -> "Ngô"
            newStr += wordCapitalized; //cộng chuỗi word vừa biến đổi vào biến newStr
            newStr += " ";            //cộng ký tự khoảng cách vào biến newStr -> tạo khoảng cách giữa các word
        } //kết thúc loop các word được viết in hoa chữ cái đầu, có khoảng cách đều nhau và lưu vào một chuỗi mới (VD: "Ngô Gia Khánh ")

        String strCapitalized = newStr.trim(); //loại bỏ khoảng trắng thừa của chuỗi mới  VD: "Ngô Gia Khánh " -> "Ngô Gia Khánh"
        System.out.println(strCapitalized);    //in ra chuỗi họ tên đã được được chuẩn hóa
    }
}
