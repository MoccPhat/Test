package Java_Swing.Menu_drawLine_Jpoppup;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class View extends JFrame {

    private JLabel label;
    JPopupMenu jpopupMenu;
    private JToolBar jtToolBar;

    public View() {
        this.init();
    }

    private void init() {
        this.setTitle("Menu Example");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Controller controller = new Controller(this);

        // Tao thanh menu
        JMenuBar menuBar = new JMenuBar();

        // Tao menu
        JMenu menu_file = new JMenu("FILE");
        JMenu menu_folder = new JMenu("Folder");
        // Tao cac menu con
        JMenuItem menuItem_open = new JMenuItem("Open");
        menuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        menuItem_open.addActionListener(controller);

        JMenuItem menuItem_new = new JMenuItem("New");
        menuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        menuItem_new.addActionListener(controller);

        JMenuItem menuItem_exit = new JMenuItem("Exit");
        menuItem_exit.addActionListener(controller);
        menuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));

        JMenuItem menuItem_1 = new JMenuItem("New Folder");
        menu_folder.add(menuItem_1);

        menu_file.add(menuItem_new);
        menu_file.add(menuItem_open);
        menu_file.addSeparator();
        menu_file.add(menu_folder);

        menu_file.addSeparator();
        menu_file.add(menuItem_exit);

        JMenu menu_view = new JMenu("View");
        // Tich nhieu lua chon
        JCheckBoxMenuItem jCheckBoxMenuItem_ToolBar = new JCheckBoxMenuItem("ToolBar");
        jCheckBoxMenuItem_ToolBar.addActionListener(controller);

        menu_view.add(jCheckBoxMenuItem_ToolBar);

        JMenu menu_help = new JMenu("HELP");
        menu_help.setDisplayedMnemonicIndex(0); // gach chan

        JMenuItem menuItem_welcome = new JMenuItem("Welcome");
        menuItem_welcome.addActionListener(controller);
        menuItem_welcome.setMnemonic(KeyEvent.VK_L);

        menu_help.add(menuItem_welcome);

        Font font = new Font("Arial", Font.BOLD, 50);
        label = new JLabel();
        label.setFont(font);

        menuBar.add(menu_file);
        menuBar.add(menu_view);
        menuBar.add(menu_help);

        // Tao thanh cong cu
        jtToolBar = new JToolBar();
        jtToolBar.setOpaque(true);
        JButton button_undo = new JButton("Undo");
        button_undo.setForeground(Color.WHITE);
        button_undo.setBackground(Color.BLACK);
        button_undo.addActionListener(controller);
        button_undo.setToolTipText("Nhap de quay lai");

        JButton button_redo = new JButton("Redo");
        button_redo.setBackground(Color.BLUE);
        button_redo.addActionListener(controller);
        button_redo.setToolTipText("Nhap de tro lai");

        JButton button_copy = new JButton("Copy");
        button_copy.setBackground(Color.yellow);
        button_copy.addActionListener(controller);
        button_copy.setToolTipText("Nhap de sao chep");

        JButton button_cut = new JButton("Cut");
        button_cut.setBackground(Color.PINK);
        button_cut.addActionListener(controller);
        button_cut.setToolTipText("Nhap de cat");

        JButton button_paste = new JButton("Paste");
        button_paste.setBackground(Color.CYAN);
        button_paste.addActionListener(controller);
        button_paste.setToolTipText("Nhap de dan");

        // Tao menu chuot phai
        jpopupMenu = new JPopupMenu();
        JMenu menu_font = new JMenu("Font");
        JMenuItem menuItem_color = new JMenuItem("color");
        JMenuItem menuItem_size = new JMenuItem("size");

        menu_font.add(menuItem_color);
        menu_font.add(menuItem_size);

        jpopupMenu.add(menu_font);

        jtToolBar.add(button_undo);
        jtToolBar.add(button_redo);
        jtToolBar.add(button_copy);
        jtToolBar.add(button_cut);
        jtToolBar.add(button_paste);

        // Them menu vao chuong trinh
        this.setJMenuBar(menuBar);
        this.setLayout(new BorderLayout());
        this.add(label, BorderLayout.CENTER);
        // this.add(jtToolBar, BorderLayout.NORTH);

        this.addMouseListener(controller);

        this.setVisible(true);
    }

    public void setTextJLabel(String s) {
        this.label.setText(s);
    }

    public void enabletoolBar() {
        this.add(jtToolBar, BorderLayout.NORTH);
    }

    public void disableToolBar() {
        this.remove(jtToolBar);
        this.refesh();
    }

    public void refesh() {
        // this.setResizable(false);f
        this.pack();
        this.setSize(500, 500);
    }
}
