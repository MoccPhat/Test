package OOPJava.QuanLisach;
public class Book {
    private String nameBook;
    private double sellingPrice;
    private int yearBook;
    private nameCreator creator;

    public Book (String namebook, double price, int yearbook, nameCreator creator){
        this.nameBook = namebook;
        this.sellingPrice = price;
        this.yearBook = yearbook;
        this.creator = creator;
    }

    public String getNameBook(){
        return nameBook;
    }
    public void setNameBook(String nameBook){
        this.nameBook = nameBook;
    }
    public double getSellingPrice(){
        return this.sellingPrice;
    }
    public void setSellingPrice(double price){
        this.sellingPrice = price;
    }
    public int getYearBook(){
        return yearBook;
    }
    public void setYearBook(int yearbook){
        this.yearBook = yearbook;
    }
    public nameCreator getCreator(){
        return creator;
    }
    public void setCreator(nameCreator creator){
        this.creator = creator;
    }

    public void print_nameBook(){
        System.out.println(this.nameBook);
    }
    
    public boolean checkYear(Book otherbook){
        return this.yearBook == otherbook.yearBook;
    }

    public double discount(double x){
        return this.sellingPrice * (1 - x / 100); 
    }
}