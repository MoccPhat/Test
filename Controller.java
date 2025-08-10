import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private View view;

    public Controller(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Thanh Toan")) {
            String monChinh = "";
            if (view.mon_Com.isSelected()) {
                monChinh = "COM";
            } else if (view.mon_Pho.isSelected()) {
                monChinh = "PHO";
            } else if (view.mon_Banh_Mi.isSelected()) {
                monChinh = "BANH MI";
            }
            view.model.setLuaChon_mon_chinh(monChinh);

            String monPhu = "";
            if (view.com_them.isSelected())
                monPhu += "COM THEM;";
            if (view.bun_them.isSelected())
                monPhu += "BUN THEM;";
            if (view.do_an_them.isSelected())
                monPhu += "CA KHO THEM;";
            if (view.tra_da.isSelected())
                monPhu += "TRA DA;";
            view.model.setLuaChon_mon_phu(monPhu);

            view.model.Tong_Tien();
            view.hien_thi_lua_chon();
        }
    }

}
