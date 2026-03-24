package lesson3.homeworkVita.lesson3;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof");
    }
}
