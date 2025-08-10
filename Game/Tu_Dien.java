package Game;
// Tu dien anh - Viet
// 1. Them tu (tu khoa, y nghia)
// 2. Xoa tu
// 3. Tim y nghia cua tu khoa => tra tu
// 4. In ra danh sach tu khoa
// 5. In ra so luong tu
// 6. Xoa tat ca cac tu khoa

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
// import java.util.TreeMap;

public class Tu_Dien {
    // private Map<String, String> tuDien = new TreeMap<String, String>();
    private Map<String, String> tuDien = new HashMap<String, String>();

    public Tu_Dien() {
    }

    // 1. Them tu (tu khoa, y nghia)
    public String themTu(String tu_khoa, String y_nghia) {
        return this.tuDien.put(tu_khoa, y_nghia);
    }

    // 2. Xoa tu
    public String xoaTu(String tu_khoa) {
        return this.tuDien.remove(tu_khoa);
    }

    // 3. Tim y nghia cua tu khoa => tra tu
    public String traTu(String tu_khoa) {
        return this.tuDien.get(tu_khoa);
    }

    // 4. In ra danh sach tu khoa
    public void InTuKhoa() {
        Set<String> tap_hop_tu_khoa = this.tuDien.keySet();
        System.out.println(Arrays.toString(tap_hop_tu_khoa.toArray()));
    }

    // 5. In ra so luong tu
    public int laySoLuong() {
        return this.tuDien.size();
    }

    // 6. Xoa tat ca cac tu khoa
    public void xoaTatCa() {
        this.tuDien.clear();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tu_Dien tuDien = new Tu_Dien();
        int choice = 0;
        do {
            System.out.println("----------MENU----------");
            System.out.println(
                    "Tra tu dien anh - Viet\n" +
                            "1. Them tu (tu khoa, y nghia)\n" +
                            "2. Xoa tu\n" +
                            "3. Tim y nghia cua tu khoa\n" +
                            "4. In ra danh sach tu khoa\n" +
                            "5. In ra so luong tu\n" + //
                            "6. Xoa tat ca cac tu khoa\n");
            System.out.println("--------------------------------------");
            System.out.print("Nhap vao lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            String tu_khoa;
            String y_nghia;

            switch (choice) {
                case 1:
                    System.out.println("Nhap vao tu khoa moi: ");
                    tu_khoa = sc.nextLine();
                    System.out.println("Nhap vao y nghia tu khoa: ");
                    y_nghia = sc.nextLine();
                    tuDien.themTu(tu_khoa, y_nghia);
                    break;
                case 2:
                    System.out.println("Nhap vao tu khoa moi: ");
                    tu_khoa = sc.nextLine();
                    tuDien.xoaTu(tu_khoa);
                    break;
                case 3:
                    System.out.println("Nhap vao tu khoa: ");
                    tu_khoa = sc.nextLine();
                    System.out.println("Tu khoa co y nghia la: " + tuDien.traTu(tu_khoa));
                    break;
                case 4:
                    tuDien.InTuKhoa();
                    break;
                case 5:
                    System.out.println("So luong tu trong tu dien la: " + tuDien.laySoLuong());
                    break;
                case 6:
                    tuDien.xoaTatCa();
                    break;
                default:
                    break;
            }

        } while (choice != 0);

        sc.close();
    }
}
