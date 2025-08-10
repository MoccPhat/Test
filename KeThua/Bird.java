package KeThua;
public class Bird extends Animal{
    public Bird (){
        super("Brid");
    }

    @Override
    public void eat(){
        System.out.println("insect");
    }
    public void makeSound(){
        System.out.println("Bird Bird");
    }
}
