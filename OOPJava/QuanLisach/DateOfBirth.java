package OOPJava.QuanLisach;
public class DateOfBirth {
    private int day;
    private int month;
    private int year;

    public DateOfBirth (int Day, int Month, int Year){
        this.day = Day;
        this.month = Month;
        this.year = Year;
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
