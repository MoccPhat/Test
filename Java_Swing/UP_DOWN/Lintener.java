package Java_Swing.UP_DOWN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lintener implements ActionListener {
    View vw;

    public Lintener(View vw) {
        this.vw = vw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        System.out.println("Ban da nhan nut: " + src);

        if (src.equals("UP")) {
            this.vw.increment();
        } else if (src.equals("DOWN")) {
            this.vw.decrement();
        }
    }

}
