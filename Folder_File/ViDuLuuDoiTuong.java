package Folder_File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

// import SinhVien;

public class ViDuLuuDoiTuong {
    public static void main(String[] args) {
        File file = new File("E:\\java\\file.data");
        try {
            OutputStream ops = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(ops);

            // SinhVien sv = new SinhVien("0001", "Nguyen Van A", 2005, 8.0);
            // oos.writeObject(sv);W
            oos.flush();
            oos.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
