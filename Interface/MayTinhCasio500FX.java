package Interface;

public class MayTinhCasio500FX implements MayTinhBoTuiInterface {

    @Override
    public double Cong(double a, double b) {
        return a + b;
    }

    @Override
    public double Tru(double a, double b) {
        return a - b;
    }

    @Override
    public double Nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double Chia(double a, double b) {
        return (b == 0)?0:a/b;
    }
}