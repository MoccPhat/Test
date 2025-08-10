package OOPJava.Computer;
public class QLMT {
    public static void main (String[] args){
        Date date1 = new Date(9,10,2025);
        Country country1 = new Country( "ISO 3166-1 alpha-2","Viet Nam");
        Country country2 = new Country( "ISO 3167-2 alpha-2","Viet Nam");
        Manufacturer m1 = new Manufacturer( "Asus", country1);
        Manufacturer m2 = new Manufacturer( "Lenovo", country2);

        Computer computer1 = new Computer(m1, date1, 500000, 6);
        Computer computer2 = new Computer(m2, date1, 600000, 6);

        System.out.println("May tinh 1 co the ban thap hon may tinh 2 khong: "+computer1.checkComputer(computer2));
        System.out.println("Ten Quoc Gia san xuat may tinh: "+country1.getNameCountry());
        ;
    }
}
