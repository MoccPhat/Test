package Java_Swing.My_Color;

import javax.swing.UIManager;

public class Test {
    public static void main(String[] args) {
        // View vw = new View();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
