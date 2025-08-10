import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Folder_File.SinhVien.SinhVien;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    // 1 Them sinh vien vao danh sach
    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

    // 2 In Danh Sach sinh vien
    public void InDanhSachSinhvien() {
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    // 3 Kiem tra danh sach sinh vien co rong hay khong
    public boolean kiemTraDanhSachSV() {
        return this.danhSach.isEmpty(); // mang co rong hay khong
    }

    // 4 Lay ra so luong sinh vien trong danh sach
    public int laySoLuongSinhVien() {
        return this.danhSach.size(); // kich co
    }

    // 5 Lam rong danh sach sinh vien
    public void lamRongDanhSachSinhVien() {
        this.danhSach.removeAll(danhSach);
    }

    // 6 Kiem tra sinh vien co ton tai khong
    public boolean kiemTraTonTai(SinhVien sv) {
        return this.danhSach.contains(sv);
    }

    // 7 Xoa mot sinh vien ra khoi danh sach
    public boolean xoaSinhVien(SinhVien sv) {
        return this.danhSach.remove(sv);
    }

    // 8 Tim kiem tat ca sinh vien dua tren ten duoc nhap
    public void timSinhVien(String ten) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            }
        }
    }

    // 9 Xuat danh sach sinh vien co diem tu cao toi thap
    public void sapXepSinhVien() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiemTB() < o2.getDiemTB()) {
                    return 1;
                } else if (o1.getDiemTB() > o2.getDiemTB()) {
                    return -1;
                } else {
                    return 0;
                }

            }

        });
    }

    // 10 Ghi du lieu xuong file
    public void GhiDuLieuXuongFile(File file) {

    }

    public void docDuLieuTuFile(File f) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'docDuLieuTuFile'");
    }
}