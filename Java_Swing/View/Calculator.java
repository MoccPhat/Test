package Java_Swing.View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Calculator extends JFrame {

    public Calculator() {

        // cua so
        this.setTitle("CALCULATOR");
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);

        // Layout
        this.setLayout(new BorderLayout(5, 3));

        // Text
        JTextField text = new JTextField(50);
        JPanel jpanel_head = new JPanel(new BorderLayout());
        jpanel_head.add(text, BorderLayout.CENTER);

        // Them nut vao panel
        JPanel jpanel_button = new JPanel(new GridLayout(5, 3));

        // Them so va phep tinh
        for (int i = 1; i <= 9; i++) {
            JButton number = new JButton(i + "");
            jpanel_button.add(number);
        }

        jpanel_button.add(new JButton("0"));
        jpanel_button.add(new JButton("+"));
        jpanel_button.add(new JButton("-"));
        jpanel_button.add(new JButton("*"));
        jpanel_button.add(new JButton("/"));
        jpanel_button.add(new JButton("="));

        // Them jpanel vao jframe
        this.add(jpanel_head, BorderLayout.NORTH);
        this.add(jpanel_button, BorderLayout.CENTER);

        // Hien cua so va dong cua o
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            // com.sun.java.swing.plaf.motif.MotifLookAndFeel
            // com.sun.java.swing.plaf.windows.WindowsLookAndFeel

            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Calculator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
