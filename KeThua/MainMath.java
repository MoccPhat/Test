package KeThua;
public class MainMath {
    public static void main(String[] args) {
        MyMath m1 = new MyMath();
        System.out.println("Min nho nhat la:");
        System.out.println(m1.FindMin(10, 5));
        System.out.println(m1.FindMin(10.0, 5.0));
        System.out.println("Tinh Tong:");
        System.out.println(m1.Sum(6.0, 9.0));
        System.out.println("Tinh Tong Array:");
        double Arr[] = new double[] {1,2,3,4,5};
        System.out.println(m1.SumArr(Arr));
    }
}