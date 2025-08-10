package KeThua;
public class Animal {
    protected String Name;

    public Animal(String Name){
        this.Name = Name;
    }

    public String getName(){
        return  this.Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }

    public void eat(){
        System.out.println("eat eat!");
    }
    public void makeSound(){
        System.out.println("Sound");
    }
    public void sleep(){
        System.out.println("Kho Kho!");
    }
}