package KeThua;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println("Dog");
        d1.sleep();
        d1.eat();
        d1.makeSound();
        Cat c1 = new Cat();
        System.out.println("Cat");
        c1.sleep();
        c1.eat();
        c1.makeSound();
        Bird b1 = new Bird();
        System.out.println("Bird");
        b1.sleep();
        b1.eat();
        b1.makeSound();
    }
}
