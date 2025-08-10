package Java_Swing.Tra_tu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View extends JFrame {
    private Model model_tim_kiem;
    private JLabel label_van_ban;
    private JLabel label_tu_khoa;
    private JTextArea text_van_ban;
    private JTextArea text_tu_khoa;
    private JLabel label_ket_qua;

    public View() {
        this.model_tim_kiem = new Model();
        this.init();
    }

    private void init() {
        this.setTitle("Tim kiem");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 40);

        label_van_ban = new JLabel("Van ban");
        label_van_ban.setFont(font);
        text_van_ban = new JTextArea(100, 100);
        text_van_ban.setFont(font);
        JScrollPane jscollpane = new JScrollPane(text_van_ban, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        label_tu_khoa = new JLabel("Tu khoa");
        label_tu_khoa.setFont(font);
        text_tu_khoa = new JTextArea();
        text_tu_khoa.setFont(font);

        Controller controller = new Controller(this);

        label_ket_qua = new JLabel();
        label_ket_qua.setFont(font);
        label_ket_qua.setForeground(Color.WHITE);
        label_ket_qua.setBackground(Color.BLACK);
        label_ket_qua.setOpaque(true);

        JPanel panel_footer = new JPanel(new GridLayout(2, 2, 10, 10));
        JButton button_thong_ke = new JButton("Thong ke");
        button_thong_ke.setOpaque(true);
        button_thong_ke.setFont(font);
        button_thong_ke.setForeground(Color.WHITE);
        button_thong_ke.setBackground(Color.BLACK);
        button_thong_ke.addActionListener(controller);

        panel_footer.add(label_tu_khoa);
        panel_footer.add(text_tu_khoa);
        panel_footer.add(button_thong_ke);
        panel_footer.add(label_ket_qua);

        this.setLayout(new BorderLayout());
        this.add(label_van_ban, BorderLayout.NORTH);
        this.add(jscollpane, BorderLayout.CENTER);
        this.add(panel_footer, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void ket_qua_thong_ke() {
        this.model_tim_kiem.setVan_ban(text_van_ban.getText());
        this.model_tim_kiem.setTu_khoa(text_tu_khoa.getText());
        this.model_tim_kiem.tim_kieṃ̣();
        this.label_ket_qua.setText(this.model_tim_kiem.getKet_qua());
    }
}
