package Folder_File;

import java.io.File;
import java.util.Scanner;

public class ViDu_file {
    File file;

    public ViDu_file(String ten_file) {
        this.file = new File(ten_file);
    }

    // Kiem tra dung hay khong
    public boolean kiemTraThucThi() {
        return this.file.canExecute();
    }

    // Kiem tra co the doc
    public boolean KiemTraDoc() {
        return this.file.canRead();
    }

    // Kiem tra co the ghi
    public boolean KiemTraGhi() {
        return this.file.canWrite();
    }

    // In ra ten duong dan
    public void InDuongDan() {
        System.out.println(this.file.getAbsolutePath());
    }

    // In ten file
    public void Intenfile() {
        System.out.println(this.file.getName());
    }

    // Kiem tra file thu muc
    public void KiemTraFileThuMuc() {
        if (this.file.isDirectory()) {
            System.out.println("Day la thuc muc!");
        } else if (this.file.isFile()) {
            System.out.println("Day la file!");
        }
    }

    // In ra danh sach cac file con
    public void InDanhSachFileCon() {
        if (this.file.isDirectory()) {
            System.out.println("Cac tap tin con/ thu muc con la: ");
            File[] mangCon = this.file.listFiles();
            for (File file : mangCon) {
                System.out.println(file);
            }
        } else if (this.file.isFile()) {
            System.out.println("Day la file, khong co du lieu con ben trong!");
        }
    }

    // In cay thu muc
    public void InCayThuMuc() {
        this.InChiTietCayThuMuc(this.file, 1);
    }

    public void InChiTietCayThuMuc(File f, int bac) {
        for (int i = 0; i < bac; i++) {
            System.out.print("\t");
        }
        System.out.println("|_");
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                InChiTietCayThuMuc(fx, bac + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        // Input file
        System.out.println("Nhap duong dan ten file: "); // VD: E:\java
        String ten_file = sc.nextLine();
        ViDu_file vdf = new ViDu_file(ten_file);

        do {
            System.out.println("----------MENU----------");
            System.out.println(
                    "1. FILE co the thuc thi\n" +
                            "2. Kiem tra FILE co the doc\n" +
                            "3. Kiem tra FILE co the ghi\n" +
                            "4. IN duong dan\n" +
                            "5. In ten FILE\n" +
                            "6. Kiem tra FILE la thu muc\n" +
                            "7. In ra dach sach cac FILE con\n" +
                            "8. In ra cay thu muc\n" +
                            "0. De thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("FIle co the duoc thuc thi khong: " + vdf.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println("FILE co doc duoc khong: " + vdf.KiemTraDoc());
                    break;
                case 3:
                    System.out.println("FIle co the ghi duoc khong: " + vdf.KiemTraGhi());
                    break;
                case 4:
                    vdf.InDuongDan();
                    break;
                case 5:
                    vdf.Intenfile();
                    break;
                case 6:
                    vdf.KiemTraFileThuMuc();
                    break;
                case 7:
                    vdf.InDanhSachFileCon();
                    break;
                case 8:
                    vdf.InCayThuMuc();
                default:
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
