package Java_Swing.UP_DOWN;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame {
    private Model model;
    private JButton jButton_up;
    private JButton jButton_down;
    private JLabel jLabel_value;

    public View() {
        this.model = new Model();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Counter");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new Lintener(this);

        jButton_up = new JButton("UP");
        jButton_up.addActionListener(ac);

        jButton_down = new JButton("DOWN");
        jButton_down.addActionListener(ac);
        jLabel_value = new JLabel(this.model.getValue() + "", JLabel.CENTER);

        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.add(jButton_up, BorderLayout.WEST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);
        jPanel.add(jButton_down, BorderLayout.EAST);

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
    }

    public void increment() {
        this.model.increment();
        this.jLabel_value.setText(this.model.getValue() + "");
    }

    public void decrement() {
        this.model.decrement();
        this.jLabel_value.setText(this.model.getValue() + "");
    }

}
