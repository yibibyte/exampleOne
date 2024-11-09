package stat;

public class Car {
    private String model;
    private int maxSpeed;
    private Integer minSpeed;
    static int counter = 0;

    public Car() {
        counter++;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Integer getMinSpeed() {
        return minSpeed;
    }

    public void toPrint() {
        System.out.println(this.model);
    }

    public void toPrintSomething() {
        toPrint();
    }

    public static int getCounter() {
        //toPrint(); // еще нет объектов
        return counter;
    }

    public static int get() {
        //toPrint(); // еще нет объектов
        return counter;
    }

}
