package OOPJava.QuanLisach;
public class nameCreator {
    private String nameCreator;
    private DateOfBirth dateofbirth;

    public nameCreator (String namecreator, DateOfBirth dateofbirth){
        this.nameCreator = namecreator;
        this.dateofbirth = dateofbirth;
    }

    public String getNameCreator(){
        return nameCreator;
    }
    public void setNameCreator(String namecreator){
        this.nameCreator = namecreator;
    }
    public DateOfBirth getDateOfBirth(){
        return this.dateofbirth;
    }
    public void setDateOfBirth(DateOfBirth dateofbirth){
        this.dateofbirth= dateofbirth;
    }
}
