
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class View extends JFrame {
    public Model model;
    public JPanel Thanh_Toan;
    public ButtonGroup buttonGroup_mon_chinh;
    public JPanel Mon_Chinh;
    public JRadioButton mon_Com;
    public JLabel ThongTin;
    public JRadioButton mon_Banh_Mi;
    public JRadioButton mon_Pho;
    public JPanel Mon_Phu;
    public JCheckBox com_them;
    public JCheckBox bun_them;
    public JCheckBox do_an_them;
    public JCheckBox tra_da;

    public View() {
        this.model = new Model();
        this.init();
    }

    private void init() {
        this.setTitle("Thuc Don");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 40);

        JLabel Tieu_De = new JLabel("THUC DON NHA HANG");
        Tieu_De.setFont(font);
        this.add(Tieu_De, BorderLayout.NORTH);

        Mon_Chinh = new JPanel(new GridLayout(1, 3));
        mon_Com = new JRadioButton("COM");
        mon_Com.setFont(font);
        mon_Pho = new JRadioButton("PHO");
        mon_Pho.setFont(font);
        mon_Banh_Mi = new JRadioButton("BANH MI");
        mon_Banh_Mi.setFont(font);

        buttonGroup_mon_chinh = new ButtonGroup();
        buttonGroup_mon_chinh.add(mon_Com);
        buttonGroup_mon_chinh.add(mon_Pho);
        buttonGroup_mon_chinh.add(mon_Banh_Mi);

        Mon_Chinh.add(mon_Com);
        Mon_Chinh.add(mon_Pho);
        Mon_Chinh.add(mon_Banh_Mi);

        Mon_Phu = new JPanel(new GridLayout(2, 2));
        com_them = new JCheckBox("COM THEM");
        com_them.setFont(font);
        bun_them = new JCheckBox("BUN THEM");
        bun_them.setFont(font);
        do_an_them = new JCheckBox("CA KHO THEM");
        do_an_them.setFont(font);
        tra_da = new JCheckBox("TRA DA");
        tra_da.setFont(font);

        Mon_Phu.add(com_them);
        Mon_Phu.add(bun_them);
        Mon_Phu.add(do_an_them);
        Mon_Phu.add(tra_da);

        JPanel lua_chon = new JPanel(new GridLayout(2, 1));
        lua_chon.add(Mon_Chinh);
        lua_chon.add(Mon_Phu);

        this.add(lua_chon, BorderLayout.CENTER);

        Controller controller = new Controller(this);

        Thanh_Toan = new JPanel(new GridLayout(1, 2));
        ThongTin = new JLabel();
        ThongTin.setFont(new Font("Arial", Font.BOLD, 20));
        JButton button_thanh_toan = new JButton("Thanh Toan");
        button_thanh_toan.setFont(font);
        button_thanh_toan.addActionListener(controller);

        Thanh_Toan.add(ThongTin);
        Thanh_Toan.add(button_thanh_toan);
        this.add(Thanh_Toan, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void hien_thi_lua_chon() {
        String kq = "Mon chinh: " + model.getLuaChon_mon_chinh()
                + "; Mon phu: " + model.getLuaChon_mon_phu()
                + "; Tong Tien: " + model.getTongTien();
        this.ThongTin.setText(kq);
    }
}
