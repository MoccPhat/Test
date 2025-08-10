package Java_Swing.MiniCalculator;

import javax.swing.UIManager;

public class Testing {
    public static void main(String[] args) {
        // View vw = new View();
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
