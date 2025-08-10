package OOPJava.Computer;
public class Computer {
    private Manufacturer manufacturer;
    private Date date;
    private double Price;
    private int Warranty;

    public Computer (Manufacturer manufacturer, Date date, double Price, int Warranty){
        this.manufacturer = manufacturer;
        this.date = date;
        this.Price = Price;
        this.Warranty = Warranty;
    }

    public Manufacturer getManufacturer(){
        return this.manufacturer;
    }
    public void setManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
    }
    public Date getDate(){
        return this.date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public double getPrice(){
        return Price;
    }
    public void setPrice(double Price){
        if(Price > 0){
            this.Price = Price;
        }
    }
    public int getWarranty(){
        return this.Warranty;
    }
    public void setWarranty(int Warranty){
        if(Warranty > 0){
            this.Warranty = Warranty;
        }
    }

    public boolean checkComputer(Computer otherComputer){
        return this.Price <  otherComputer.Price;
    }
    
    public String NameCountry(){
        return this.manufacturer.NameCountry();
    }
   
}
