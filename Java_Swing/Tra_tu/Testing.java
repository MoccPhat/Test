package Java_Swing.Tra_tu;

import javax.swing.UIManager;

public class Testing {
    public static void main(String[] args) {
        // View vw = new View();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
