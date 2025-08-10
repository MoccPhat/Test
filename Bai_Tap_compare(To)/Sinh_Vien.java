public class Sinh_Vien implements Comparable<Sinh_Vien> {
    private int ma_sinh_vien;
    private String ho_va_ten;
    private String ten_lop;
    private double diem_trung_binh;

    public Sinh_Vien(int ma_sinh_vien, String ho_va_ten, String ten_lop, double diem_trung_binh) {
        this.ma_sinh_vien = ma_sinh_vien;
        this.ho_va_ten = ho_va_ten;
        this.ten_lop = ten_lop;
        this.diem_trung_binh = diem_trung_binh;
    }

    public int getMa_sinh_vien() {
        return ma_sinh_vien;
    }

    public void setMa_sinh_vien(int ma_sinh_vien) {
        this.ma_sinh_vien = ma_sinh_vien;
    }

    public String getHo_va_ten() {
        return ho_va_ten;
    }

    public void setHo_va_ten(String ho_va_ten) {
        this.ho_va_ten = ho_va_ten;
    }

    public String getTen_lop() {
        return ten_lop;
    }

    public void setTen_lop(String ten_lop) {
        this.ten_lop = ten_lop;
    }

    public double getDiem_trung_binh() {
        return diem_trung_binh;
    }

    public void setDiem_trung_binh(double diem_trung_binh) {
        this.diem_trung_binh = diem_trung_binh;
    }

    public String getTen() {
        String s = this.ho_va_ten.trim();
        if (s.indexOf(" ") >= 0) {
            int vi_tri = s.lastIndexOf(" ");
            return s.substring(vi_tri + 1);
        } else {
            return s;
        }
    }

    @Override
    public int compareTo(Sinh_Vien o) {
        // < 0
        // = 0
        // > 0
        // so sanh dua tren ten
        // String ten_this = this.getTen();
        // String ten_o = o.getTen();
        // return this.ma_sinh_vien - o.ma_sinh_vien;
        // return ten_this.compareTo(ten_o);
        return Double.compare(this.diem_trung_binh, o.diem_trung_binh);
    }
}
