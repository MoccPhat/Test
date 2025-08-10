package Java_Swing.Layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class FlowLayout_fl extends JFrame {
    public FlowLayout_fl() {
        this.setTitle("FlowLayout");
        this.setSize(600, 600);
        // Can giua cua so chung trinh
        this.setLocationRelativeTo(null);

        // set layout
        // FlowLayout flowLayout = new FlowLayout();
        // FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.RIGHT); // Hien thi nut
        // nhat ben tay phai
        // FlowLayout flowLayout_3 = new FlowLayout(FlowLayout.CENTER, 10, 10); // Hien
        // thi nut nhan o giua cach nhau
        // 10pixel
        // FlowLayout flowLayout_4 = new FlowLayout(FlowLayout.LEFT); // Hien thi nut
        // nha ben trai
        // FlowLayout flowLayout_5 = new FlowLayout(FlowLayout.LEADING);
        FlowLayout flowLayout_6 = new FlowLayout(FlowLayout.TRAILING);

        this.setLayout(flowLayout_6);
        JButton button_1 = new JButton("OK");
        JButton button_2 = new JButton("Cancel");
        this.add(button_1);
        this.add(button_2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayout_fl();
    }
}
