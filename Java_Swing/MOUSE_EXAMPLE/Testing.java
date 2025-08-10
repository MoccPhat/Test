package Java_Swing.MOUSE_EXAMPLE;

import javax.swing.UIManager;

public class Testing {

    public static void main(String[] args) {
        // View vw = new View();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
