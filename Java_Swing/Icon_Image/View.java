package Java_Swing.Icon_Image;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class View extends JFrame {

    public View() {
        this.init();
    }

    private void init() {
        this.setTitle("ICON");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 40);

        URL urlIconNotepad = View.class.getResource("Icon_notepad.png");
        Image img = Toolkit.getDefaultToolkit().createImage(urlIconNotepad);

        this.setIconImage(img);

        JMenuBar menu_bar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem it_1 = new JMenuItem("New");
        it_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        it_1.setIcon(new ImageIcon(View.class.getResource("icon_new.png")));

        JMenuItem it_2 = new JMenuItem("Save");
        it_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        it_2.setIcon(new ImageIcon(View.class.getResource("icon_save.png")));

        JMenuItem it_3 = new JMenuItem("Save As");
        it_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.ALT_DOWN_MASK));
        it_3.setIcon(new ImageIcon(View.class.getResource("icon_save_as.png")));

        JMenuItem it_4 = new JMenuItem("Exit");
        it_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        it_4.setIcon(new ImageIcon(View.class.getResource("icon_exit.png")));

        JMenuItem it_5 = new JMenuItem("Test");
        it_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
        it_5.setIcon(new ImageIcon(View.class.getResource("icon_test.png")));

        menu_bar.add(menu);
        menu.add(it_1);
        menu.addSeparator();
        menu.add(it_2);
        menu.addSeparator();
        menu.add(it_3);
        menu.addSeparator();
        menu.add(it_4);
        menu.addSeparator();
        menu.add(it_5);

        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(View.class.getResource("ShiBa_image.jpg")));

        JPanel panel_footer = new JPanel();
        JButton button_test = new JButton("TEST BUTTON");
        button_test.setFont(font);
        button_test.setIcon(new ImageIcon(View.class.getResource("icon_button.png")));

        panel_footer.add(button_test);

        this.setLayout(new BorderLayout());
        this.setJMenuBar(menu_bar);
        this.add(label, BorderLayout.CENTER);
        this.add(panel_footer, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
