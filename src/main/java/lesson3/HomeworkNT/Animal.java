package lesson3.HomeworkNT;

public abstract class Animal {
    private String name;
    private String animalType;

    public Animal(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
    }

    protected Animal() {
    }


    public abstract void makeSound();
}
