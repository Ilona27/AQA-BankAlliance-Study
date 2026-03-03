package lesson3.HomeworkNT;

public class Main {
    public static void main(String[] args) {
    Animal animal = new Dog("JD", "Chihou-Houa");
    animal.makeSound();

    Animal animal2 = new Cat("DJ", "British");
    animal2.makeSound();

    String newAnimalType = animal.changeName();
    System.out.println(newAnimalType);
    }
}
