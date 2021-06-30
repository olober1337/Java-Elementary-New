package lesson1.classwork;

public abstract class AbstractAnimal implements AnimalInterface {
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void voice() {
        System.out.println("voice");
    }
}
