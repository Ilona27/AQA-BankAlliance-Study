package lesson3.homeworkVita.lesson3;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow");
    }
}
