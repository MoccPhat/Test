package Generic;
public class Box_2 {
    public static void main(String[] args) {
        Generic_Box_2 gb2 = new Generic_Box_2<Integer>(15);
        System.out.println("Gia tri: " + gb2.getValue());
        Generic_Box_2 gb3 = new Generic_Box_2<String>("MoccPhat");
        System.out.println("Gia tri: " + gb3.getValue());
        Generic_Box_2 gb4 = new Generic_Box_2<Double>(15.5);
        System.out.println("Gia tri: "+gb4.getValue());
    }
}
