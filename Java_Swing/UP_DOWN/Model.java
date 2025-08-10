package Java_Swing.UP_DOWN;

public class Model {
    private int Value;

    public Model() {
        this.Value = 0;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public void increment() {
        this.Value++;
    }

    public void decrement() {
        this.Value--;
    }

    public void reset() {
        this.Value = 0;
    }
}
