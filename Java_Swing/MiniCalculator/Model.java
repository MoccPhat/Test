package Java_Swing.MiniCalculator;

public class Model {
    private double value_1;
    private double value_2;
    private double answer;

    public Model() {
    }

    public double getValue_1() {
        return this.value_1;
    }

    public void setValue_1(double value_1) {
        this.value_1 = value_1;
    }

    public double getValue_2() {
        return this.value_2;
    }

    public void setValue_2(double value_2) {
        this.value_2 = value_2;
    }

    public double getAnswer() {
        return this.answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void Cong() {
        this.answer = this.value_1 + this.value_2;
    }

    public void Tru() {
        this.answer = this.value_1 - this.value_2;
    }

    public void Nhan() {
        this.answer = this.value_1 * value_2;
    }

    public void Chia() {
        this.answer = this.value_1 / value_2;
    }

    public void Pow() {
        this.answer = Math.pow(this.value_1, this.value_2);
    }

    public void Mod() {
        this.answer = this.value_1 % this.value_2;
    }
}
