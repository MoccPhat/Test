package OOPJava.Movie;
public class RapChieu {
    public static void main (String[] args){
        HangSx hang1 = new HangSx("Tran Thanh", "Viet Nam");
        NgayChieu ngay1 = new NgayChieu(12, 2, 2022);
        Phim phim1 = new Phim("Xom Tro",2022,hang1,55000,ngay1);
            
        HangSx hang2 = new HangSx("Thu Trang", "Viet Nam");
        NgayChieu ngay2 = new NgayChieu(12, 2, 2023);
        Phim phim2 = new Phim("Xom Tui",2022,hang2,65000,ngay2);

        System.out.println("Gia ve phim 2 co re hon gia ve phim 1 hay khong: "+phim1.KiemTraVe(phim2));
        System.out.println("Ten cua hang phim san xuat la: "+(phim1.tenHangPhimSx()));
        System.out.println("Gia cua phim khuyen mai: "+phim1.GiaVeKhuyenMai(10)); // khuyến mãi và giảm giá sau khi giảm dùng chung 1 công thứcthức

        System.out.println("Gia ve phim 2 co re hon gia ve phim 1 hay khong: "+phim1.KiemTraVe(phim2));
        System.out.println("Ten cua hang phim san xuat la: "+(phim2.tenHangPhimSx()));
        System.out.println("Gia cua phim khuyen mai: "+phim2.GiaVeKhuyenMai(20));
    }
}
