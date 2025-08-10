package BTABS;
public class Motorbike extends Vehicle { 
    
    public Motorbike (String Name){
        super(Name);
    }

    @Override 
    public void Start(){
        System.err.println("Xe dang chay tren cat");
    }
    @Override
    public String Name(){
        return this.Name;
    }
    @Override 
    public void Stop(){
        System.err.println("Xe dang dung tren cat");
    }
}
