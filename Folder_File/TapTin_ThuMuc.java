package Folder_File;

import java.io.File;
import java.io.IOException;

public class TapTin_ThuMuc {
    public static void main(String[] args) {
        // note: MS Windows: \ => \\ VD: "C: \\Thuc muc 1\\ Ten tep tin.xxx";
        File folder1 = new File("E:\\java");
        File folder2 = new File("E:\\java\\BT");
        File folder3 = new File("E:\\java\\BT.txt");

        System.out.println("Kiem tra folder1 co ton tai hay khong: " + folder1.exists());
        System.out.println("Kiem tra folder1 co ton tai hay khong: " + folder2.exists());
        System.out.println("Kiem tra folder1 co ton tai hay khong: " + folder3.exists());

        // Tao thu muc
        // Phuong thuc: mkdir() => tao 1 thu muc
        File folder4 = new File("E:\\java\\Directory_1");
        folder4.mkdir();

        // Phuong thuc: mkdirs() => tao nhieu thu muc cung luc
        // File folder5 = new
        // File("E:\\java\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
        // folder5.mkdirs();

        // Tao tap tin (co phan mo rong): .exe .txt .doc .xls ...
        File file1 = new File("E:\\java\\Directory_1\\Vidu1.txt");
        File file2 = new File("E:\\java\\Directory_1\\Vidu2.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            // kkhong co quyen tao tap tin
            // o cung day
            // sai duong dan
            e.printStackTrace();
        }

    }
}
