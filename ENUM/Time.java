package ENUM;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
// import java.util.concurrent.TimeUnit;

public class Time {
    public static void main(String[] args) {

        // Ham lay thoi gian hien tai
        // long t1 = System.currentTimeMillis();
        // for(int i = 0 ; i < 1000000;i++){
        // System.out.println("TEST");
        // }
        // long t2 = System.currentTimeMillis();
        // System.out.println("Truoc khi chay for: "+t1);
        // System.out.println("Sau khi chay for: "+t2);
        // System.out.println("Thoi gian: "+((t2 - t1))+"mls");
        // System.out.println("Thoi gian: "+((t2 - t1) / 1000)+"s");

        // TImeUnit
        // System.out.println("3000 nam = "+TimeUnit.DAYS.toSeconds(3000*365)+"s");
        // System.out.println("25h = "+TimeUnit.HOURS.toSeconds(25)+"s");

        // Date
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date.getDate() + "/" + (date.getMonth() + 1) + "/" + (date.getYear() + 1900));

        // calendar
        Calendar cld = Calendar.getInstance();
        System.out
                .println(cld.get(Calendar.DATE) + "-" + (cld.get(Calendar.MONDAY) + 1) + "-" + cld.get(Calendar.YEAR));

        cld.add(Calendar.HOUR, 48);
        System.out.println(cld.get(Calendar.DATE) + "-" + (cld.get(Calendar.MONTH) + 1) + "-" + cld.get(Calendar.YEAR));

        cld.add(Calendar.DATE, 14);
        System.out.println(cld.get(Calendar.DATE) + "-" + (cld.get(Calendar.MONTH) + 1) + "-" + cld.get(Calendar.YEAR));

        // DateFormat
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(date));

        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(date));
    }
}
