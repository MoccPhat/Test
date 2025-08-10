package Java_Swing.My_Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class View extends JFrame {
    // private Model model;
    private JLabel label;

    public View() {
        // this.model = model;
        this.init();
    }

    private void init() {
        this.setTitle("My Color");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.CENTER_BASELINE, 40);

        label = new JLabel("----------TEXT----------");
        label.setFont(font);
        label.setOpaque(true);
        JPanel panel = new JPanel(new GridLayout(2, 4));

        Controller controller = new Controller(this);

        JButton button_text_red = new JButton("Red text");
        button_text_red.setFont(font);
        button_text_red.setForeground(Color.RED);
        button_text_red.setOpaque(true);
        button_text_red.addActionListener(controller);

        JButton button_text_yellow = new JButton("Yellow text");
        button_text_yellow.setFont(font);
        button_text_yellow.setForeground(Color.YELLOW);
        button_text_yellow.setOpaque(true);
        button_text_yellow.addActionListener(controller);

        JButton button_text_green = new JButton("Green text");
        button_text_green.setFont(font);
        button_text_green.setForeground(Color.GREEN);
        button_text_green.setOpaque(true);
        button_text_green.addActionListener(controller);

        JButton button_text_blue = new JButton("Blue text");
        button_text_blue.setFont(font);
        button_text_blue.setForeground(Color.BLUE);
        button_text_blue.setOpaque(true);
        button_text_blue.addActionListener(controller);

        JButton button_background_red = new JButton("Red background");
        button_background_red.setFont(font);
        button_background_red.setBackground(Color.RED);
        button_background_red.setOpaque(true);
        button_background_red.addActionListener(controller);

        JButton button_background_yellow = new JButton("Yellow background");
        button_background_yellow.setFont(font);
        button_background_yellow.setBackground(Color.YELLOW);
        button_background_yellow.setOpaque(true);
        button_background_yellow.addActionListener(controller);

        JButton button_background_green = new JButton("Green background");
        button_background_green.setFont(font);
        button_background_green.setBackground(Color.GREEN);
        button_background_green.setOpaque(true);
        button_background_green.addActionListener(controller);

        JButton button_background_Blue = new JButton("Blue background");
        button_background_Blue.setFont(font);
        button_background_Blue.setBackground(Color.BLUE);
        button_background_Blue.setOpaque(true);
        button_background_Blue.addActionListener(controller);

        panel.add(button_text_red);
        panel.add(button_text_yellow);
        panel.add(button_text_green);
        panel.add(button_text_blue);

        panel.add(button_background_red);
        panel.add(button_background_yellow);
        panel.add(button_background_green);
        panel.add(button_background_Blue);

        this.setLayout(new BorderLayout());
        this.add(label, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void changeTextColor(Color color) {
        this.label.setForeground(color);
    }

    public void changeBackGroudColor(Color color) {
        this.label.setBackground(color);
    }
}
