package Java_Swing.Graphics;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawExample extends JFrame {
    public DrawExample() {
        this.setTitle("DRAW EXAMPLE");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());

        JPanelDraw panelDraw = new JPanelDraw();

        this.add(panelDraw, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawExample();
    }
}
