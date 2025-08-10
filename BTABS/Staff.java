package BTABS;
public class Staff {
    private String Name;
    private int Age;
    private String Sex;
    private String Address;

    public Staff (String Name, int Age, String Sex, String Address){
        this.Name = Name;
        this.Age = Age;
        this.Sex = Sex;
        this.Address = Address;
    }

    public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public int getAge(){
        return this.Age;
    }
    public void setAge(int Age){
        if(Age > 0){
            this.Age = Age;
        }
    }
    public String getSex(){
        return this.Sex;
    }
    public void setSex(String Sex){
            this.Sex = Sex;
    }
    public String getAddress(){
        return this.Address;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
}
