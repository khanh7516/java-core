package Homework5;

public class SinhVienIT extends SinhVienTechMaster {
    private double javaScore;
    private double htmlScore;
    private double cssScore;

    public SinhVienIT(String name, String major, double javaScore, double htmlScore, double cssScore) {
            super(name, major);
            this.javaScore = javaScore;
            this.htmlScore = htmlScore;
            this.cssScore = cssScore;
    }

    @Override
    public double getDiem() {
        return (2 * javaScore + htmlScore + cssScore) / 4;
    }
}
