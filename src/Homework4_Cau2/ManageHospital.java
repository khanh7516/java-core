package Homework4_Cau2;

public class ManageHospital {
    public static void main(String[] args) {
        //khởi tạo 2 đối tượng doctor kiểu dữ liệu Doctor và đối tượng patient kiểu dữ liệu Patient bằng hàm khởi tạo có tham số
        Doctor doctor = new Doctor("Nguyen Thi A", 35, "Đống Đa, Hà Nội", "0123456789", "Tiêu hóa", 5.5);
        Patient patient = new Patient("Nguyen Van B", 25, "Cầu Giấy, Hà Nội", "0999999999", 05, "2023/04/02");
        //in ra thông tin bác sĩ
        System.out.println("Doctor's information:");
        System.out.println("Name: " + doctor.getName());
        System.out.println("Age: " + doctor.getAge());
        System.out.println("Address: " + doctor.getAddress());
        System.out.println("Specialty: " + doctor.getSpecialty());
        System.out.println("Hours of work: " + doctor.getWorkingHours() +"\n");
        //in ra thông tin bệnh nhân
        System.out.println("Patient's information:");
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("Medical record number: " + patient.getMedicalRecordNumber());
        System.out.println("Amission Date: " + patient.getAdmissionDate());
    }
}
