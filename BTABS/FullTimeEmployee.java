package BTABS;
public class FullTimeEmployee extends Employee {
    
    private float MonthSalary;

    public FullTimeEmployee(Staff staff, float MonthSalary){
        super(staff);
        this.MonthSalary = MonthSalary;
    }

    public float getMonthSalary(){
        return this.MonthSalary;
    }
    public void setMonthSalary(float MontSalary){
        this.MonthSalary = MontSalary;
    }
    
    @Override 
    public float Salary(){
        return this.MonthSalary;
    }
}
