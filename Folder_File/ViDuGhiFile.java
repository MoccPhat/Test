package Folder_File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ViDuGhiFile {
    public static void main(String[] args) {
        PrintWriter pw;
        try {
            pw = new PrintWriter("E:\\java\\file.txt", "UTF-8");
            pw.println("XIN CHAO!");
            pw.println("Du lieu: ");
            pw.println(3.14);
            pw.print(' ');
            pw.println("La so Pi");
            pw.println("2 3 con muc");
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
