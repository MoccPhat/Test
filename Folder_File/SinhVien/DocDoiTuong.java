package Folder_File.SinhVien;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class DocDoiTuong {
    public static void main(String[] args) {
        try {
            File f = new File("E:\\java\\file_sv.data");
            InputStream is = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien sv = (SinhVien) ois.readObject();

            System.out.println(sv);
            ois.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
