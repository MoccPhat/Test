package OOPJava.Student;
import java.util.Scanner;

public class Student {
    private String ID;
    private String Name;
    private int age;
    private double Point;

    public Student (String id, String name, int age, double point){
        this.ID = id;
        this.Name = name;
        this.age = age;
        this.Point = point;
        }
        public void InputStudent(){
            Scanner sc = new Scanner(System.in);
            System.out.println("ID: ");
            this.ID = sc.nextLine();
            System.out.println("Name: ");
            this.Name = sc.nextLine();
            System.out.println("Age: ");
            this.age = sc.nextInt();
            System.out.println("GPA: ");
            this.Point = sc.nextDouble();
            sc.close();
    }
    public void StudentList(){
        System.out.println("ID: "+this.ID);
        System.out.println("Name: "+this.Name);
        System.out.println("Age: "+this.age);
        System.out.println("GPA: "+this.Point);
    }
}
