package Game;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_RutTham {
        Set<String> phieu_du_thuong = new TreeSet<String>();

        public TreeSet_RutTham() {
        }

        public boolean themPhieuDuThuong(String gia_tri) {
            return this.phieu_du_thuong.add(gia_tri);
        }

        public boolean xoaPhieu(String gia_tri) {
            return this.phieu_du_thuong.remove(gia_tri);
        }

        public boolean kiemTraPhieuTonTai(String gia_tri) {
            return this.phieu_du_thuong.contains(gia_tri);
        }

        public void xoaPhieuDuThuong() {
            this.phieu_du_thuong.clear();
        }

        public int laySoLuong() {
            return this.phieu_du_thuong.size();
        }

        public String rutThamPhieu() {
            String ket_qua = "";
            Random rd = new Random();
            int vi_tri = rd.nextInt(this.phieu_du_thuong.size());
            ket_qua = (String) this.phieu_du_thuong.toArray()[vi_tri];
            return ket_qua;
        }

        public void InTatCa(){
            System.out.println(Arrays.toString(this.phieu_du_thuong.toArray()));
        }


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int choice = 0;
            TreeSet_RutTham hs = new TreeSet_RutTham();
            System.out.println();
            do {
                System.out.println("----------MENU----------");
                System.out.println("1. Them ma so du thuong");
                System.out.println("2. Xoa ma so du thuong");
                System.out.println("3. Kiem tra ma so du thuong co ton tai hay khong?");
                System.out.println("4. Xoa tat ca cac phieu du thuong");
                System.out.println("5. So luong phieu du thuong");
                System.out.println("6. Rut tham trung thuong");
                System.out.println("7. In ra tat ca cac phieu");
                System.out.println("0. De thoat khoi chuong trinh!");
                System.out.print("Nhap vao lua chon: ");
                choice = sc.nextInt();
                sc.nextLine();
                String gia_tri;
                switch (choice) {
                    case 1:
                        System.out.println("Nhap vao phieu du thuong: ");
                        gia_tri = sc.nextLine();
                        hs.themPhieuDuThuong(gia_tri);
                        break;
                    case 2:
                        System.out.println("Nhap vao phieu du thuong: ");
                        gia_tri = sc.nextLine();
                        hs.xoaPhieu(gia_tri);
                        break;
                    case 3:
                        System.out.println("Nhap vao phieu du thuong: ");
                        gia_tri = sc.nextLine();
                        System.out.println("Ket qua kiem tra: " + hs.kiemTraPhieuTonTai(gia_tri));
                        break;
                    case 4:
                        hs.xoaPhieuDuThuong();
                        break;
                    case 5:
                        System.out.println("So luong cua phieu rut tham la: " + hs.laySoLuong());
                        break;
                    case 6:
                        System.out.println("Ma so trung thuong la: " + hs.rutThamPhieu());
                        break;
                    case 7:
                        System.out.println("Cac ma phieu du thuong la: ");
                        hs.InTatCa();
                        break;
                    default:
                        break;
                }

            } while (choice != 0);

            sc.close();
    }
}

