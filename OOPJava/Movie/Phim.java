package OOPJava.Movie;
public class Phim {
    private String tenPhim;
    private int namSx;
    private HangSx hangsx;
    private double giaVe;
    private NgayChieu ngaychieu;

    public Phim(String tenPhim, int namSx, HangSx hangsx, double giaVe, NgayChieu ngayChieu){
        this.tenPhim = tenPhim;
        this.namSx = namSx;
        this.hangsx = hangsx;
        this.giaVe = giaVe;
        this.ngaychieu = ngayChieu; 
    }

    public String getTenPhim(){
        return this.tenPhim;
    }
    public void setTenPhim(String tenPhim){
        this.tenPhim = tenPhim;
    }
    public int getNamSx(){
        return this.namSx;
    }
    public void setNamSx(int namSx){
        this.namSx = namSx;
    }
    public HangSx getHangSx(){
        return this.hangsx;
    }
    public void setHangSx(HangSx hangSx){
        this.hangsx = hangSx;
    }
    public double getGiaVe(){
        return this.giaVe;
    }
    public void setGiaVe(double giaVe){
        this.giaVe = giaVe;
    }
    public NgayChieu getNgayChieu(){
        return this.ngaychieu;
    }
    public void setNgayChieu(NgayChieu ngayChieu){
        this.ngaychieu = ngayChieu;
    }

    public boolean KiemTraVe(Phim VeKhac){
        return this.giaVe <= VeKhac.giaVe;
    }
     public String tenHangPhimSx(){
        return this.hangsx.getTenHangSx();
    }
    public double GiaVeKhuyenMai(double x){
        return this.giaVe * (1 - x / 100);
    }
}
