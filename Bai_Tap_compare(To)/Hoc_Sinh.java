public class Hoc_Sinh implements Comparable<Hoc_Sinh> {
    private String Ten;
    private double DTB;

    public Hoc_Sinh(String ten, double dTB) {
        Ten = ten;
        DTB = dTB;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public double getDTB() {
        return DTB;
    }

    public void setDTB(double dTB) {
        DTB = dTB;
    }

    @Override
    public int compareTo(Hoc_Sinh other) {
        int cmpDiem = Double.compare(other.DTB, this.DTB);
        if (cmpDiem != 0) {
            return cmpDiem;
        }
        return this.Ten.compareTo(other.Ten);
    }

    @Override
    public String toString() {
        return "Ten: "+Ten+" Diem "+DTB;
    }
}
