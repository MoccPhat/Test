package KeThua;
public class Dog extends Animal{
    public Dog (){
        super("Dog");
    }
    
    @Override
    public void eat(){
        System.out.println("meat");
    }
    public void makeSound(){
        System.out.println("Gau Gau Gau");
    }
}
