package OOPJava.MyDate;
public class date {
    private int day;
    private int month;
    private int year;

    public date (int Day, int Month, int Year){
        if(Day >= 1 && Day <= 31){
             this.day = Day;
        } else this.day = 1;
       if(Month >= 1 && Month <= 12){
        this.month = Month;
       } else this.month = 1;
       if (Year >= 1){
        this.year = Year;
       } else this.year = 1;
    } 
    public int getDay(){
        return this.day;
    } 
    public void setDay(int Day){
        this.day = Day;
    }
    public int getMonth(){
        return this.month;
    }
    public void setMonth(int Month){
        this.month = Month;
    }
    public int getYear(){
        return this.year; 
    }
    public void setYear(int Year){
        this.year = Year;
    }
    @Override
    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;   
    }
    @Override
    public boolean equals (Object obj){ //object đại diện cho các đối tượng trong java
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        date other = (date)obj;
        if(this.day != other.day) return false;
        if(this.month != other.month) return false;
        if(this.year != other.year) return false;
        return true;
    }
    @Override 
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + day;
        result = prime * result + month;
        result = prime * result + year;
        return result; 
    }
}
