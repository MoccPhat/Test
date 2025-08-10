package Java_Swing.MOUSE_EXAMPLE;

public class Model {
    private int x, y;
    private int count;
    private String checkIn;

    public Model() {
        this.x = 0;
        this.y = 0;
        this.count = 0;
        this.checkIn = "no";
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCheckIn() {
        return this.checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public void addClick() {
        this.count++;
    }

    public void enter() {
        this.checkIn = "YES";
    }

    public void exit() {
        this.checkIn = "NO";
    }

}
