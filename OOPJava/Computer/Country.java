package OOPJava.Computer;
public class Country{
    private String CountryCode;
    private String NameCountry;

    public Country(String CountryCode, String NameCountry){
        this.CountryCode = CountryCode;
        this.NameCountry = NameCountry;
    }

    public String getCountryCode(){
        return this.CountryCode;
    }
    public void setCountryCode(String CountryCode){
        this.CountryCode = CountryCode;
    }
    public String getNameCountry(){
        return this.NameCountry;
    }
    public void setNameCountry(String NameCountry){
        this.NameCountry = NameCountry;
    }
}