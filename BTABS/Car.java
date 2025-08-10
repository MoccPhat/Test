package BTABS;
public class Car extends Vehicle {
    
    public Car(String Name){
        super(Name);
    }

    @Override
    public void Start(){
        System.err.println("Xe dang chay tren duong");
    }
    @Override
    public String Name(){
        return this.Name();
    }
    @Override
    public void Stop(){
        System.err.println("Xe dang dung tren duong");
    }
}
