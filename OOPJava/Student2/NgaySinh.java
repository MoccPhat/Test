package OOPJava.Student2;
public class NgaySinh {
    private int day;
    private int month;
    private int year;

    public NgaySinh (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return this.day;
    }
    public void setDay(int day){
        if(day >= 1 && day <= 31){
            this.day = day;
        }
    }
    public int getMonth(){
        return this.month;
    }
    public void setMonth(int month){
        if(month >= 1 && month <= 12){
            this.month = month;
        }
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        if(year >= 1){
            this.year = year;
        }
    }

    @Override
    public boolean equals(Object obj ){
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        NgaySinh other = (NgaySinh)obj;
        if(day != other.day) return false; 
        if(month != other.month) return false;
        if(year != other.year) return false;
        return true;
        }
}
