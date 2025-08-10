package Java_Swing.My_Color;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sk = e.getActionCommand();
        System.out.println("Ban da nhan nut mau: " + sk);
        if (sk.equals("Red text")) {
            this.view.changeTextColor(Color.RED);
        } else if (sk.equals("Yellow text")) {
            this.view.changeTextColor(Color.YELLOW);
        } else if (sk.equals("Green text")) {
            this.view.changeTextColor(Color.GREEN);
        } else if (sk.equals("Blue text")) {
            this.view.changeTextColor(Color.BLUE);
        } else if (sk.equals("Red background")) {
            this.view.changeBackGroudColor(Color.RED);
        } else if (sk.equals("Yellow background")) {
            this.view.changeBackGroudColor(Color.YELLOW);
        } else if (sk.equals("Green background")) {
            this.view.changeBackGroudColor(Color.GREEN);
        } else if (sk.equals("Blue background")) {
            this.view.changeBackGroudColor(Color.BLUE);
        }
    }

}
