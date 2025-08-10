package Java_Swing.MOUSE_EXAMPLE;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame {
    private Model model;
    private JLabel label_position;
    private JLabel label_x;
    private JLabel label_y;
    private JLabel label_countValue;
    private JLabel label_count;
    private JLabel label_empty_1;
    private JLabel label_checkIn;
    private JLabel label_checkValue;
    private JLabel label_empty_2;

    public View() {
        this.model = new Model();
        this.init();
    }

    private void init() {
        this.setTitle("MOUSE EXAMPLE");
        this.setSize(450, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Controller controller = new Controller(this);

        JPanel panel_mouse = new JPanel();
        panel_mouse.setBackground(Color.CYAN);
        panel_mouse.setOpaque(true);
        panel_mouse.addMouseListener(controller);
        panel_mouse.addMouseMotionListener(controller);

        JPanel panel_info = new JPanel(new GridLayout(3, 3, 10, 10));

        Font font = new Font("Arial", Font.BOLD, 12);

        label_position = new JLabel("Position");
        label_position.setFont(font);
        label_x = new JLabel("x = ");
        label_x.setFont(font);
        label_y = new JLabel("y = ");
        label_y.setFont(font);
        label_count = new JLabel("Number of click: ");
        label_count.setFont(font);
        label_countValue = new JLabel("0");
        label_countValue.setFont(font);
        label_empty_1 = new JLabel();
        label_empty_1.setFont(font);
        label_checkIn = new JLabel("Mouse is in component: ");
        label_checkIn.setFont(font);
        label_checkValue = new JLabel("no");
        label_checkValue.setFont(font);
        label_empty_2 = new JLabel();
        label_empty_2.setFont(font);

        panel_info.add(label_position);
        panel_info.add(label_x);
        panel_info.add(label_y);
        panel_info.add(label_count);
        panel_info.add(label_countValue);
        panel_info.add(label_empty_1);
        panel_info.add(label_checkIn);
        panel_info.add(label_checkValue);
        panel_info.add(label_empty_2);

        this.setLayout(new BorderLayout());
        this.add(panel_mouse, BorderLayout.CENTER);
        this.add(panel_info, BorderLayout.SOUTH);
        this.setVisible(true);

    }

    public void Click() {
        this.model.addClick();
        this.label_countValue.setText(this.model.getCount() + "");
    }

    public void enter() {
        this.model.enter();
        this.label_checkValue.setText(this.model.getCheckIn());
    }

    public void exit() {
        this.model.exit();
        this.label_checkValue.setText(this.model.getCheckIn());
    }

    public void update(int x, int y) {
        this.model.setX(x);
        this.model.setY(y);
        this.label_x.setText(this.model.getX() + "");
        this.label_y.setText(this.model.getY() + "");
    }
}
