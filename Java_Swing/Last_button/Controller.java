package Java_Swing.Last_button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nguon_su_kien = e.getActionCommand();
        if (nguon_su_kien.equals("1")) {
            this.view.changeTo_1();
        } else if (nguon_su_kien.equals("2")) {
            this.view.changeTo_2();
        } else if (nguon_su_kien.equals("3")) {
            this.view.changeTo_3();
        } else if (nguon_su_kien.equals("4")) {
            this.view.changeTo_4();
        }
    }

}