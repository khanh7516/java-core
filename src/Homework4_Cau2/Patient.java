package Homework4_Cau2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient extends Person {
    private int medicalRecordNumber;
    private LocalDate admissionDate;

    public Patient(String name, int age, String address, String phoneNumber, int medicalRecordNumber, String admissionDateStr) {  //tham số admissionDateStr(ngày nhập viện) có kiểu dữ liệu String trong hàm khởi tạo Patient()
        super(name, age, address, phoneNumber);
        this.medicalRecordNumber = medicalRecordNumber;
        this.admissionDate =  LocalDate.parse(admissionDateStr,  DateTimeFormatter.ofPattern("yyyy/MM/dd")); //admissionDateStr chuyển đổi dữ liệu String sang LocalDate rồi gán cho thuộc tính (admissionDate) của đối tượng
    }

    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(int medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDateStr) {  //hàm nhận đối số là kiểu String có định dạng "yyyy/MM/dd".
        this.admissionDate =  LocalDate.parse(admissionDateStr,  DateTimeFormatter.ofPattern("yyyy/MM/dd")); //admissionDateStr chuyển đổi dữ liệu String sang LocalDate rồi gán cho thuộc tính admissionDate của đối tượng
    }
}
