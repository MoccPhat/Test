package OOPJava.QuanLisach;

public class MainBook {
    public static void main (String[] args){
        DateOfBirth day1 = new DateOfBirth(9, 10, 2022);
        nameCreator name1 = new nameCreator("MoccPhat", day1);
        Book book1 = new Book("Lap Trinh", 50000, 2012, name1);
        Book book2 = new Book("Lap Trinh", 15000, 2012, name1);

        System.out.println("Ten cua sach la:");
        book1.print_nameBook();
        System.out.println("So sach sach nam xuat ban sach 1 va 2: "+book1.checkYear(book2));
        System.out.println("Book 1 sau khi giam 10%: "+book1.discount(10));
          System.out.println("Book 2 sau khi giam 20%: "+book2.discount(20));
    }
}
