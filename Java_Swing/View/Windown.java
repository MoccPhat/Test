package Java_Swing.View;

import javax.swing.JFrame;

public class Windown extends JFrame {

    public Windown() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void show_Windows() {
        this.setVisible(true);
    }

    public void show_Windows(String title) {
        this.setTitle(title);
        this.setVisible(true);
    }

    public void show_Windows(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Windown wd = new Windown();
        wd.show_Windows();

        Windown wd2 = new Windown();
        wd2.show_Windows("JAVA SWING 1");

        Windown wd3 = new Windown();
        wd3.show_Windows("JAVA SWING 2", 800, 300);
    }
}
