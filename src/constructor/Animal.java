package constructor;

public class Animal {

    private String name = "Sharik";
    private int age = 10;
    private String color = "Black";
    public static int cout = 0;

    public Animal() {
        System.out.println("Animal constructor is default Name, Age and Color:  " + "\n" + name + " " + age + " " + color);
        cout++;
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor one parameter: Name");
        cout++;
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor with two parameters: Name and Age");
        cout++;
    }
    public void bark() {
        System.out.println("Make sound!");
    }
}
