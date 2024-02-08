package stat;

public class Car {
    String model;
    int maxSpeed;
    private  static int counter = 0;
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
