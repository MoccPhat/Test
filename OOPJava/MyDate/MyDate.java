package OOPJava.MyDate;
public class MyDate{
    private int day;
    private int month;
    private int year;
    public MyDate(int Day, int Month, int Year){
        this.day = Day;
        this.month = Month;
        this.year = Year;
    }
    public void print_day(){
        System.out.println("Day: "+this.day);
    }
    public void print_month(){
        System.out.println("Month: "+this.month);
    }
    public void print_year(){
        System.out.println("Year: "+this.year);
    }
    public void print_date(){
        System.out.println("Day: " +this.day+ " Month: "+this.month+ " Year: " +this.year);
    }
}

