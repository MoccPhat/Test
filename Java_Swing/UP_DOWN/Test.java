package Java_Swing.UP_DOWN;

import javax.swing.UIManager;

public class Test {
    public static void main(String[] args) {
        Model md = new Model();
        md.increment();
        md.increment();
        md.increment();
        System.out.println(md.getValue());
        md.decrement();
        System.out.println(md.getValue());

        try {
            // com.sun.java.swing.plaf.motif.MotifLookAndFeel
            // com.sun.java.swing.plaf.windows.WindowsLookAndFeel

            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            // View vw = new View();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
