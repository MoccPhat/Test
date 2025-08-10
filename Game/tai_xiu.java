package Game;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class tai_xiu {
    public static void main(String[] args) {
        // Khai bao bien
        double tai_khoang_nguoi_choi = 0;
        double dat_cuoc = tai_khoang_nguoi_choi;
        // Dịnh dang so
        Locale lc = new Locale("vn", "VN");
        NumberFormat num = NumberFormat.getInstance(lc);
        // NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        // Nhap gia tri
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            // Khu vuc lua chon
            System.out.println("<--------------------MOI BAN LUA CHON-------------------->");
            System.out.println("Chon (1) de tiep tuc choi");
            System.out.println("Chon (0) de thoat");
            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();

            // Khu vuc da chon so 1
            if (choice == 1) {
                System.out.print("*****BAT DAU CHOI*****");
                System.out.print("\nNhap vao so tien ban nap vao: ");
                tai_khoang_nguoi_choi = sc.nextDouble();
                System.out.println("Tai khoang ban hien co la: " + num.format(tai_khoang_nguoi_choi));

                // Nhap lai so tien neu be hon dieu kien choi la 10000
                do {
                    System.out.print("Nhap vao so tien ban muon cuoc(so tien >= 10000): ");
                    dat_cuoc = sc.nextDouble();
                } while (tai_khoang_nguoi_choi <= 0 || tai_khoang_nguoi_choi < dat_cuoc);
                // Tai Xiu
                int lua_chon_tai_xiu = 0;
                do {
                    System.out.println("***** Chon 1 (Tai) <-----> Chon 2 (xiu)*****");
                    System.out.print("Lua chon: ");
                    lua_chon_tai_xiu = sc.nextInt();
                } while (lua_chon_tai_xiu != 1 && lua_chon_tai_xiu != 2);

                // Xuc Xac
                Random xuc_xac_1 = new Random();
                Random xuc_xac_2 = new Random();
                Random xuc_xac_3 = new Random();

                // Gia tri
                int gia_tri_1 = xuc_xac_1.nextInt(6) + 1;
                int gia_tri_2 = xuc_xac_2.nextInt(6) + 1;
                int gia_tri_3 = xuc_xac_3.nextInt(6) + 1;
                int Tong_3_gia_tri = gia_tri_1 + gia_tri_2 + gia_tri_3;
                // Tinh toan ket qua
                System.out.println("Ket qua: " + gia_tri_1 + " - " + gia_tri_2 + " - " + gia_tri_3);
                // So tien ban dat cuoc con lai
                if (Tong_3_gia_tri == 3 || Tong_3_gia_tri == 18) {
                    System.out.println("Tong 3 xuc xac = " + Tong_3_gia_tri + " Ban thua, nha ai an het");
                    System.out.println("So tien dat cuoc con lai: " + num.format(tai_khoang_nguoi_choi - dat_cuoc));
                } else if (Tong_3_gia_tri >= 4 && Tong_3_gia_tri <= 10) {
                    System.out.println("*****Tong la: " + Tong_3_gia_tri + " xiu*****");
                    if (lua_chon_tai_xiu == 2) {
                        System.out.println("Ket qua: " + gia_tri_1 + " - " + gia_tri_2 + " - " + gia_tri_3);
                        System.out.println("Ban da thang cuoc!");
                        System.out.println("So tien con lai: " + num.format(tai_khoang_nguoi_choi + dat_cuoc));
                    } else {
                        System.out.println("Ket qua: " + gia_tri_1 + " - " + gia_tri_2 + " - " + gia_tri_3);
                        System.out.println("Ban da thua cuoc!");
                        System.out.println("So tien con lai: " + num.format(tai_khoang_nguoi_choi - dat_cuoc));
                    }
                } else {
                    System.out.println("*****Tong la: " + Tong_3_gia_tri + " tai*****");
                    if (lua_chon_tai_xiu == 1) {
                        System.out.println("Ket qua: " + gia_tri_1 + " - " + gia_tri_2 + " - " + gia_tri_3);
                        System.out.println("Ban da thang cuoc!");
                        System.out.println("So tien con lai: " + num.format(tai_khoang_nguoi_choi + dat_cuoc));
                    } else {
                        System.out.println("Ket qua: " + gia_tri_1 + " - " + gia_tri_2 + " - " + gia_tri_3);
                        System.out.println("Ban da thua cuoc!");
                        System.out.println("So tien con lai: " + num.format(tai_khoang_nguoi_choi - dat_cuoc));
                    }
                }
            }
        } while (choice != 0);
        // ket thuc chuong trinh
        System.out.println("Ban da thoat khoi game, cam on ban da choi!");
        // Dong nhap
        sc.close();
    }
} 