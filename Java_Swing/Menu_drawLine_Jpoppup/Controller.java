package Java_Swing.Menu_drawLine_Jpoppup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;

public class Controller implements ActionListener, MouseListener {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("Open")) {
            this.view.setTextJLabel("Ban da click JMenuItem OPEN");
        } else if (button.equals("Exit")) {
            // this.view.setTextJLabel("Ban da click JMenuItem EXIT");
            System.exit(0);
            // thoat khoi chuong trinh
        } else if (button.equals("Welcome")) {
            this.view.setTextJLabel("Ban da click JMenuItem WELCOME");
        } else if (button.equals("New")) {
            this.view.setTextJLabel("Ban da click JMenuItem NEW");
        } else if (button.equals("Undo")) {
            this.view.setTextJLabel("Ban da click Undo");
        } else if (button.equals("Redo")) {
            this.view.setTextJLabel("Ban da click Redo");
        } else if (button.equals("Copy")) {
            this.view.setTextJLabel("Ban da click Copy");
        } else if (button.equals("Cut")) {
            this.view.setTextJLabel("Ban da click Cut");
        } else if (button.equals("Paste")) {
            this.view.setTextJLabel("Ban da click Paste");
        } else if (button.equals("color")) {
            this.view.setTextJLabel("Ban da click color");
        } else if (button.equals("size")) {
            this.view.setTextJLabel("Ban da click size");
        } else if (button.equals("ToolBar")) {
            AbstractButton checkBox = (AbstractButton) e.getSource();
            boolean check = checkBox.getModel().isSelected();
            if (check) {
                this.view.enabletoolBar();
            } else {
                this.view.disableToolBar();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.isPopupTrigger()) {
            this.view.jpopupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
            this.view.jpopupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
