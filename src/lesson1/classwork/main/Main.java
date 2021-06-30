package lesson1.classwork.main;

import lesson1.classwork.Animal;

public class Main extends Animal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();

        Animal cat = new Cat();
        cat.voice();

        Main main = new Main();
        main.test(cat);

    }
    public void test(Animal animal) {
        animal.voice();
        if (animal instanceof Cat) {
            System.out.println("This is cat");
        }

        if (animal instanceof Animal) {
            System.out.println("This is plain animal");
        }
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    // Полиморфизм - один интерфейс и множество реализаций. ПОЧИТАТЬ БОЛЕЕ ДЕТАЛЬНО!!!!

}
