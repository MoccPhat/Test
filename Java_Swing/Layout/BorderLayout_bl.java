package Java_Swing.Layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout_bl extends JFrame {
    public BorderLayout_bl() {
        this.setTitle("BroaderLayout");

        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        // Set LayOut
        // BorderLayout brl = new BorderLayout();
        BorderLayout brl_2 = new BorderLayout(10, 10);

        this.setLayout(brl_2);
        JButton button_OK = new JButton("OK");
        JButton button_cc = new JButton("Cancel");
        JButton button_Hl = new JButton("Hello");
        JButton button_Bye = new JButton("Bye");
        JButton button_bt = new JButton("BT");
        this.add(button_OK, BorderLayout.NORTH);
        this.add(button_cc, BorderLayout.SOUTH);
        this.add(button_bt, BorderLayout.CENTER);
        this.add(button_Bye, BorderLayout.EAST);
        this.add(button_Hl, BorderLayout.WEST);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayout_bl();
    }
}
