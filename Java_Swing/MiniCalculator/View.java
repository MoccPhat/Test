package Java_Swing.MiniCalculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class View extends JFrame {
    private Model model;
    private JTextField text_value1, text_value2, text_answer;

    public View() {
        this.model = new Model();
        this.init();
    }

    private void init() {
        this.setTitle("Mini Calculator");
        this.setSize(450, 600);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 40);

        Controller controller = new Controller(this);

        JPanel panel_1 = new JPanel(new GridLayout(3, 2, 10, 10));
        JLabel label_1 = new JLabel("1st VALUE:: ");
        label_1.setFont(font);
        JLabel label_2 = new JLabel("2st VALUE: ");
        label_2.setFont(font);
        JLabel label_3 = new JLabel("ANSWER: ");
        label_3.setFont(font);

        text_value1 = new JTextField(30);
        text_value1.setFont(font);
        text_value2 = new JTextField(30);
        text_value2.setFont(font);
        text_answer = new JTextField(30);
        text_answer.setFont(font);

        panel_1.add(label_1);
        panel_1.add(text_value1);
        panel_1.add(label_2);
        panel_1.add(text_value2);
        panel_1.add(label_3);
        panel_1.add(text_answer);

        JPanel panel_2 = new JPanel(new GridLayout(2, 3, 10, 10));
        JButton button_cong = new JButton("+");
        button_cong.setFont(font);
        button_cong.addActionListener(controller);

        JButton button_tru = new JButton("-");
        button_tru.setFont(font);
        button_tru.addActionListener(controller);

        JButton button_chia = new JButton("/");
        button_chia.setFont(font);
        button_chia.addActionListener(controller);

        JButton button_nhan = new JButton("*");
        button_nhan.setFont(font);
        button_nhan.addActionListener(controller);

        JButton button_non = new JButton("^");
        button_non.setFont(font);
        button_non.addActionListener(controller);

        JButton button_mod = new JButton("MOD");
        button_mod.setFont(font);
        button_mod.addActionListener(controller);

        panel_2.add(button_cong);
        panel_2.add(button_tru);
        panel_2.add(button_chia);
        panel_2.add(button_nhan);
        panel_2.add(button_non);
        panel_2.add(button_mod);

        this.setLayout(new BorderLayout(10, 10));
        this.add(panel_1, BorderLayout.NORTH);
        this.add(panel_2, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void Cong() {
        double value_1 = Double.valueOf(text_value1.getText());
        double value_2 = Double.valueOf(text_value2.getText());
        this.model.setValue_1(value_1);
        this.model.setValue_2(value_2);
        this.model.Cong();
        this.text_answer.setText(this.model.getAnswer() + "");
    }

    public void Tru() {
        double value_1 = Double.valueOf(text_value1.getText());
        double value_2 = Double.valueOf(text_value2.getText());
        this.model.setValue_1(value_1);
        this.model.setValue_2(value_2);
        this.model.Tru();
        this.text_answer.setText(this.model.getAnswer() + "");
    }

    public void Nhan() {
        double value_1 = Double.valueOf(text_value1.getText());
        double value_2 = Double.valueOf(text_value2.getText());
        this.model.setValue_1(value_1);
        this.model.setValue_2(value_2);
        this.model.Nhan();
        this.text_answer.setText(this.model.getAnswer() + "");
    }

    public void Chia() {
        double value_1 = Double.valueOf(text_value1.getText());
        double value_2 = Double.valueOf(text_value2.getText());
        this.model.setValue_1(value_1);
        this.model.setValue_2(value_2);
        this.model.Chia();
        this.text_answer.setText(this.model.getAnswer() + "");
    }

    public void Pow() {
        double value_1 = Double.valueOf(this.text_value1.getText());
        double value_2 = Double.valueOf(this.text_value2.getText());
        this.model.setValue_1(value_1);
        this.model.setValue_2(value_2);
        this.model.Pow();
        this.text_answer.setText(this.model.getAnswer() + "");
    }

    public void Mod() {
        double value_1 = Double.valueOf(this.text_value1.getText());
        double value_2 = Double.valueOf(this.text_value2.getText());
        this.model.setValue_1(value_1);
        this.model.setValue_2(value_2);
        this.model.Mod();
        this.text_answer.setText(this.model.getAnswer() + "");
    }
}
