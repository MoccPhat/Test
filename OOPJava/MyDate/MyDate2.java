package OOPJava.MyDate;
public class MyDate2 {
    private int day;
    private int month;
    private int year;

    public MyDate2(int Day, int Month, int Year) {
        if (Day >= 1 && Day <= 31) {
            this.day = Day;
        } else {
            this.day = 1;
        }
        if (Month >= 1 && Month <= 12) {
            this.month = Month;
        } else {
            this.month = 1;
        }
        if (Year >= 1) {
            this.year = Year;
        } else {
            this.year = 1;
        }
    }

    public int getDay(){
        return this.day;
    } 
    public void setDay(int Day){
        if(Day >= 1 && Day <= 31){
            this.day = Day;
        }
        
    }
    public int getMonth(){
        return this.month;
    }
    public void setMonth(int Month){
        if(Month >= 1 && Month <= 12){
            this.month = Month;
        }
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int Year){
        if(Year >= 1){
            this.year = Year;
        }
        
    }
}
