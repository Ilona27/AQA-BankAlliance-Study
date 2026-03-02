package homework;

import homework.lesson2.nickZ.HomeworkLesson2NickZ;
import homework.lesson3.Animals;
import homework.lesson3.Cat;
import homework.lesson3.Dog;



public class Main {
    public static void main(String[] args) {
        HomeworkLesson2NickZ practise = new HomeworkLesson2NickZ();
        System.out.println(practise.checkPositive(-10));
        System.out.println(practise.temperature(37.6));
        int a = 50;
        int b =10;
        System.out.println((a+b)*2);
        Dog dog = new Dog("Pes");
        Cat cat = new Cat("Kit");
        dog.MakeSound();
        cat.MakeSound();
        String name = cat.getName();
        System.out.println(name);
        String name1 = dog.getName();
        System.out.println(name1);

    }


}

