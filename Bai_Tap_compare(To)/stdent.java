import java.util.Arrays;
public class stdent {
    public static void main(String[] args) {
        Student[] ds = {
            new Student("Nguyen Van A", 10),
            new Student("Nguyen Van B", 13),
            new Student("Nguyen Van C", 11),
            new Student("Nguuyen Van D", 12)
        };
        Arrays.sort(ds);
        System.out.println("Danh sach tuoi sap xep tang dan: ");
        for(Student std : ds){
            System.out.println(std);
        }
    }
}
