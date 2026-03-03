package lesson3.HomeworkNT;

public class Cat extends Animal {
    public Cat(String name, String animalType) {
        super(name, animalType);
    }
    @Override
    public void makeSound() {System.out.println("Cat says: Meow");}
}
