package Java_Swing.Last_button;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class View extends JFrame {
    private Model model;
    private JLabel label;
    private JButton button;
    private JPanel panel_footer, panel_Center;

    public View() {
        this.model = new Model();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("LAST BUTTON");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);

        panel_Center = new JPanel(new GridLayout(2, 2));

        Font font = new Font("Arial", Font.BOLD, 20);

        ActionListener ac = new Controller(this);

        for (int i = 1; i <= 4; i++) {
            button = new JButton(i + "");
            panel_Center.add(button);
            button.setFont(font);
            button.addActionListener(ac);
        }

        panel_footer = new JPanel();

        label = new JLabel("-------");
        label.setFont(font);
        panel_footer.add(label);

        this.setLayout(new BorderLayout());
        this.add(panel_Center, BorderLayout.CENTER);
        this.add(panel_footer, BorderLayout.SOUTH);
    }

    public void changeTo_1() {
        this.model.Value_1();
        label.setText("Last button: " + this.model.getValue());
    }

    public void changeTo_2() {
        this.model.Value_2();
        label.setText("Last button: " + this.model.getValue());
    }

    public void changeTo_3() {
        this.model.Value_3();
        label.setText("Last button: " + this.model.getValue());
    }

    public void changeTo_4() {
        this.model.Value_4();
        label.setText("Last button: " + this.model.getValue());
    }

}
