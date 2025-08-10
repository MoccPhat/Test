package Java_Swing.Tra_tu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String ket_qua = e.getActionCommand();
        System.out.println("Click: " + ket_qua);
        this.view.ket_qua_thong_ke();
    }

}
