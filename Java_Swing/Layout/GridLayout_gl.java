package Java_Swing.Layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout_gl extends JFrame {
    public GridLayout_gl() {
        this.setTitle("GRIDLAYOUT");

        this.setSize(300, 300);
        this.setLocationRelativeTo(null);

        // set layout
        // GridLayout gridLayout = new GridLayout();
        // GridLayout gridLayout_2 = new GridLayout(10, 10);
        GridLayout gridLayout_3 = new GridLayout(4, 4, 25, 25);
        this.setLayout(gridLayout_3);

        for (int i = 0; i < 16; i++) {
            JButton bt = new JButton(i + "");
            this.add(bt);
        }
        // this.setLayout(gridLayout_3);
        JButton button_1 = new JButton("OK");
        JButton button_2 = new JButton("Cancel");
        this.add(button_1);
        this.add(button_2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayout_gl();
    }
}
