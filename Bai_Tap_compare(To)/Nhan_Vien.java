public class Nhan_Vien implements Comparable<Nhan_Vien> {
    private String Ten;
    private double Luong;

    public Nhan_Vien(String ten, double luong) {
        Ten = ten;
        Luong = luong;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double luong) {
        Luong = luong;
    }

    @Override
    public int compareTo(Nhan_Vien o) {
        return Double.compare(o.Luong, this.Luong);
    }
    @Override 
    public String toString(){
        return "Nhan Vien Co Luong Cao Nhat " +Luong;
    }
}
