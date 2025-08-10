package Folder_File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuFile {
    public static void copyAll(File f1, File f2) {
        try {
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (f1.isDirectory()) {
            File[] mangCon = f1.listFiles();
            for (File file : mangCon) {
                File file_new = new File(f2.getAbsolutePath() + "/" + file.getName());
                copyAll(file, file_new);
            }
        }
    }

    public static void main(String[] args) {
        // File F0 = new File("E:\\java\\File_1.txt.txt");
        // File F1 = new File("E:\\java\\File_2.txt.txt");
        File F2 = new File("E:\\java\\File_3.txt.txt");

        // 1. Thay doi ten tap tin hoac thu muc
        // F0.renameTo(F1);

        // Su dung thay doi ten files
        // try {
        // Files.move(F1.toPath(), F2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        // 2. Di chuyen file
        // File file2 = new File("E:\\java\\F0\\File_3.txt");
        // try {
        // Files.move(F2.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        // 3. Copy files
        File F_0 = new File("E:\\java\\F0");
        File file_copy = new File("E:\\java\\F0\\file_copy");

        try {
            Files.copy(F_0.toPath(), file_copy.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // copy tat ca
        ViDuFile.copyAll(F_0, F2);
        ;

    }
}
