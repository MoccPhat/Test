package BTABS;
public class Truck extends Vehicle{
    
    public Truck (String Name){
        super(Name);
    }

    @Override
    public void Start(){
        System.err.println("Xe dang chay tren quoc lo");
    }
    @Override
    public String Name(){
        return this.Name();
    }
    @Override 
    public void Stop(){
        System.err.println("Xe dang dung tren quoc lo");
    }
}
