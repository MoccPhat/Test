package Java_Swing.MiniCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        System.out.println("Ban da nhan nut: " + button);
        if (button.equals("+")) {
            this.view.Cong();
        } else if (button.equals("-")) {
            this.view.Tru();
        } else if (button.equals("*")) {
            this.view.Nhan();
        } else if (button.equals("/")) {
            this.view.Chia();
        } else if (button.equals("^")) {
            this.view.Pow();
        } else if (button.equals("MOD")) {
            this.view.Mod();
        }
    }

}
