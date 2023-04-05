package Homework5;

public abstract class SinhVienTechMaster {
    private String name;
    private String major;

    public SinhVienTechMaster(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    abstract public double getDiem();

    public String getHocLuc() {
        String result = "";
        if (7.5 <= getDiem() && getDiem() <= 10 ) result = "Giỏi";
        else if (6.5 <= getDiem() && getDiem() < 7.5 ) result = "Khá";
        else if (5 <= getDiem() && getDiem() < 6.5 ) result = "Trung Bình";
        else if (0 <= getDiem() && getDiem() < 5) result = "Yếu";
        return result;
    }

    public void xuat() {
        System.out.println("Họ tên: " + getName());
        System.out.println("Ngành học: " + getMajor());
        System.out.println("Điểm TB: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}
