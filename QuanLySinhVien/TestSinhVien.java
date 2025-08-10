import java.util.Scanner;

import Folder_File.SinhVien.DanhSachSinhVien;
import Folder_File.SinhVien.SinhVien;

public class TestSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        do {
            System.out.println("----------MENU----------");
            System.out.println(
                    "1.	Them sinh vien vao danh sach.\n"
                            + "2.	In danh sach sinh vien ra man hinh.\n"
                            + "3.	Kiem tra danh sach co rong hay khong.\n"
                            + "4.	Lay ra so luong sinh vien trong danh sach.\n"
                            + "5.	Lam rong danh sach sinh vien.\n"
                            + "6.	Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien.\n"
                            + "7.	Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien.\n"
                            + "8.	Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim.\n"
                            + "9.	Xuat ra danh sach sinh vien co điem tu cao đen thap.\n"
                            + "10.  Luu danh sach sinh vien xuong tap tin\n"
                            + "0.   Thoat khoi chuong trinh");
            System.out.println("Nhap vao lua chon cua ban");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ma sinh vien: ");
                    String maSinhVien = sc.nextLine();
                    System.out.println("Nhap ho va ten: ");
                    String hoVaTen = sc.nextLine();
                    System.out.println("Nhap nam sinh: ");
                    int namSinh = sc.nextInt();
                    System.out.println("Nhap diem trung binh: ");
                    double DTB = sc.nextDouble();
                    SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, DTB);
                    dssv.themSinhVien(sv);
                    break;
                case 2:
                    System.out.println("-----Danh sach sinh vien-----");
                    dssv.InDanhSachSinhvien();
                    break;
                case 3:
                    System.out.println("Danh sach rong: " + dssv.kiemTraDanhSachSV());
                    break;
                case 4:
                    System.out.println("So luong sinh vien trong danh sach: " + dssv.laySoLuongSinhVien());
                    break;
                case 5:
                    System.out.println("Danh sach rong: ");
                    dssv.lamRongDanhSachSinhVien();
                    break;
                case 6:
                    System.out.println("Nhap ma sinh vien: ");
                    maSinhVien = sc.nextLine();
                    SinhVien sv2 = new SinhVien(maSinhVien);
                    System.out.println("Kiem tra sinh vien co trong danh sach: " + dssv.kiemTraTonTai(sv2));
                    break;
                case 7:
                    System.out.println("Nhap ma sinh vien: ");
                    maSinhVien = sc.nextLine();
                    SinhVien sv3 = new SinhVien(maSinhVien);
                    System.out.println("xoa sinh vien trong danh sach: " + dssv.xoaSinhVien(sv3));
                    break;
                case 8:
                    System.out.println("Nhap vao ho va ten: ");
                    hoVaTen = sc.nextLine();
                    System.out.println("Ket qua tim kiem: ");
                    dssv.timSinhVien(hoVaTen);
                    break;
                case 9:
                    dssv.sapXepSinhVien();
                    dssv.InDanhSachSinhvien();
                    break;
                default:
                    break;
            }

        } while (choice != 0);
        sc.close();
    }
}