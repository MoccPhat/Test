package Folder_File;

// import java.io.BufferedReader;
import java.io.File;
// import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ViDuDocFile {
    public static void main(String[] args) {
        // Cach 1
        // File file = new File("E:\\java\\file.txt");
        // try {
        // BufferedReader brd = Files.newBufferedReader(file.toPath(),
        // StandardCharsets.UTF_8);
        // String line = null;
        // while (true) {
        // line = brd.readLine();
        // if (line == null) {
        // break;
        // } else {
        // System.out.println(line);
        // }
        // }
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        // Canh 2
        File file = new File("E:\\java\\file.txt");
        try {
            List<String> allTest = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : allTest) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
