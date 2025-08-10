package Java_Swing.View;

import javax.swing.JFrame;

public class ViDu {
    public static void main(String[] args) {
        // Tao cua so JFrame
        JFrame frame = new JFrame();

        // Ten tieu de cua cua so
        frame.setTitle("JAVA SWING");

        // Chieu cao va chieu rong cua cua so
        frame.setSize(400, 300);

        // while (true) {
        // System.out.println("CHUONG TRINH DANG CHAY");
        // }

        // Thoat ra khoi chuong trinh khi dong cua so
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Dat vi tri cua cua so
        frame.setLocation(800, 300);

        // Cho phep hien thi cua so "TRUE hien cua so" --- "FALSE dong cua so"
        frame.setVisible(true);
    }
}
