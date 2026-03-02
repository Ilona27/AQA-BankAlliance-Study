package homework.lesson3;

public class Dog extends Animals{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void MakeSound() {
        System.out.println("Dog says: Woof");

    }
}
