package OOPJava.Computer;
public class Manufacturer {
    private String Information;
    private Country country;

    public Manufacturer (String Information, Country country){
        this.Information = Information;
        this.country = country;
    }

    public String getInfomation(){
        return this.Information;
    }
    public void setInfomation(String Information){
        this.Information = Information;
    }
    public Country getCountry(){
        return this.country;
    }
    public void setCountry(Country country){
        this.country = country;
    }
    public String NameCountry(){
        return this.country.getNameCountry();
    }
}
