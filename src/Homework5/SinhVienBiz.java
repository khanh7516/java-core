package Homework5;

public class SinhVienBiz extends SinhVienTechMaster{
    private double marketingScore;
    private double salesScore;

    public SinhVienBiz(String name, String major, double marketingScore, double salesScore) {
        super(name, major);
        this.marketingScore = marketingScore;
        this.salesScore = salesScore;
    }


    @Override
    public double getDiem() {
        return (2* marketingScore + salesScore) / 3;
    }
}
