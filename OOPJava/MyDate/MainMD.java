package OOPJava.MyDate;

public class MainMD {
    public static void main (String[] agrs) {
        MyDate2 md = new MyDate2(31,1,2021);
        System.out.println("Day: "+md.getDay());
        md.setDay(35); // được bảo toàn và không thay đổi
        System.out.println("Day: "+md.getDay());
        md.setDay(30);
        System.out.println("Day: "+md.getDay());

        md.setMonth(5);
        System.out.println("Month: "+md.getMonth());
        md.setMonth(10);
        System.out.println("Month: "+md.getMonth());
        md.setMonth(13); // được bảo toàn và không thay đổi
        System.out.println("Month: "+md.getMonth());

        md.setYear(2021);
        System.out.println("Year: "+md.getYear());
        md.setYear(2022);
        System.out.println("Year: "+md.getYear());
        md.setYear(-2023); // được bảo toàn và không thay đổi
        System.out.println("Year: "+md.getYear());
    }
}
