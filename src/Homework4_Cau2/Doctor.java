package Homework4_Cau2;

public class Doctor extends Person {
    private String specialty;
    private double workingHours;

    public Doctor(String name, int age, String address, String phoneNumber, String specialty, double workingHours) {
        super(name, age, address, phoneNumber);
        this.specialty = specialty;
        this.workingHours = workingHours;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
