package Folder_File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {

    public static void xoaFile(File fx) {
        // Xao neu la tap tin
        System.out.println("Da xoa: " + fx.getAbsolutePath());
        if (fx.isFile()) {
            fx.delete();
        } else if (fx.isDirectory()) {
            // Lay cac file con
            File[] mangCon = fx.listFiles();
            for (File file : mangCon) {
                // Xoa cac file con
                xoaFile(file);
            }
            // Xoa ban than thu muc sau khi da xoa cac file con
            System.out.println("Da xoa: " + fx.getAbsolutePath());
            fx.delete();
        }
    }

    public static void main(String[] args) {
        // Su dung class file de xoa tap tin hoac thu muc
        // File F0 = new File("E:\\java\\F0");
        File F0_1 = new File("E:\\java\\F0_1");
        File F = new File("E:\\java\\ViDu.txt");

        // xoa thu muc (thu muc phai rong)
        // F0.deleteOnExit();
        // F0_1.deleteOnExit();
        // F.deleteOnExit();
        // System.out.println(F0_1.delete());

        // xoa thu muc co tap tin con
        // ViDuXoaFile.xoaFile(F0);

        // Su dung class files xoa tap tin va thu muc
        // Tao duong dan
        // Path p0 = F0.toPath();
        Path p0_1 = F0_1.toPath();
        Path p = F.toPath();
        try {
            // Files.deleteIfExists(p0);
            Files.deleteIfExists(p0_1);
            Files.deleteIfExists(p);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
