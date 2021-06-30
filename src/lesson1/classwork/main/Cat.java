package lesson1.classwork.main;

import lesson1.classwork.Animal;

public class Cat extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("may may");
    }

    private int voice(int i) {
        return i;
    }
}
