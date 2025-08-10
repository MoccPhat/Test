package BTABS;
public class PartTimeEmployee extends Employee {

    private float Hours;
    private float Rate;

    public PartTimeEmployee (Staff staff, float Hours, float Rate){
        super(staff);
        this.Hours = Hours;
        this.Rate = Rate;
    }

    public float getHours(){
        return this.Hours;
    }
    public void setHours(float Hours){
        if(Hours == 0) return;
        if(Hours > 0){
            this.Hours = Hours;
        }
    }

    public float getRate(){
        return this.Rate;
    } 
    public void setRate(float Rate){
        this.Rate = Rate;
    }

    @Override
    public float Salary() {
        return this.Hours * this.Rate; 
    }
}
