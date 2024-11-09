package constructor;

public class Dog extends Animal{
    private String name = "Palkan";
    private int age = 20;
    private String color = "Brown";

    public static int cout = 0;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
        System.out.println("Dog Constructor");
        cout++;
    }
    @Override
    public void bark() {
//        super.bark();
        System.out.println("Woof Woof");
    }
}

