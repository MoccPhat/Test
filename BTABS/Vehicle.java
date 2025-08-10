package BTABS;
public abstract class Vehicle {
    protected String Name;

    public Vehicle (String Name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }

    public abstract void Start();
    public abstract String Name();
    public abstract void Stop();
}
