package lesson3.HomeworkNT;

public abstract class Animal {
    private String name;
    private String animalType;

    public Animal(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
    }

public String getAnimalType(){
        return animalType;
}

    public String changeName(){
        return getAnimalType().toUpperCase();
    }
    public abstract void makeSound();
}
