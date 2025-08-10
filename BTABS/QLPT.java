package BTABS;

public class QLPT {
    public static void main(String[] args){
        System.err.println("----------------------------");
        Car car1 = new Car("VinFast");
        System.out.println(car1.getName());
        car1.Start();
        car1.Stop();
        System.err.println("----------------------------");
        Motorbike moto1 = new Motorbike("XRS-155");
        System.err.println(moto1.getName());
        moto1.Start();
        moto1.Stop();
        System.err.println("----------------------------");
        Truck truck1 = new Truck("Xe Tai");
        System.err.println(truck1.getName());
        truck1.Start();
        truck1.Stop();
        System.err.println("----------------------------");
    }
}
