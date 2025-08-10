package Java_Swing.My_Color;

import java.awt.Color;

public class Model {
    private Color forground;
    private Color background;
    private boolean opaque;

    public Model() {
        this.forground = Color.BLACK;
        this.background = Color.WHITE;
        this.opaque = true;
    }

    public Color getForground() {
        return forground;
    }

    public void setForground(Color forground) {
        this.forground = forground;
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }

}
