package lesson3.HomeworkNT;

public class Dog extends Animal {
    public Dog(String name, String animalType) {
        super(name, animalType);
    }
    @Override
    public void makeSound() {System.out.println("Dog says: Woof");}

}
