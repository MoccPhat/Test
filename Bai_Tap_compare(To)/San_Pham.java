public class San_Pham implements Comparable<San_Pham> {
    private String Ten_San_Pham;
    private double Gia;

    public San_Pham(String ten_San_Pham, double gia) {
        Ten_San_Pham = ten_San_Pham;
        Gia = gia;
    }

    public String getTen_San_Pham() {
        return Ten_San_Pham;
    }

    public void setTen_San_Pham(String ten_San_Pham) {
        Ten_San_Pham = ten_San_Pham;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double gia) {
        Gia = gia;
    }

    public String toString(){
        return "San Pham theo thu tu ten: " +Ten_San_Pham;
    } 

    @Override
    public int compareTo(San_Pham o) {
        return this.Ten_San_Pham.compareTo(o.Ten_San_Pham);
    }
}
