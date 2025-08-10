package KeThua;
public class Cat extends Animal {
    public Cat(){
        super("Cat");
    }

    @Override 
    public void  eat(){
        System.out.println("Fish");
    }
    public void makeSound(){
        System.out.println("Meow Meow");
    }
}
