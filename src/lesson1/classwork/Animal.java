package lesson1.classwork;

public class Animal {
    private static final String VARIB = "CONST";

    private int height;

    int weight;

    protected int variable1;

    public int variable2;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void voice() {
        System.out.println("gav gav");
    }
}
