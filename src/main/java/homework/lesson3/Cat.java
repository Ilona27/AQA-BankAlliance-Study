package homework.lesson3;

public class Cat extends Animals{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void MakeSound() {
        System.out.println("Cat says: Meow");

    }
}
