package Generic;
public class Generic_Box_2<T> {
    private T value;

    public Generic_Box_2 (T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
