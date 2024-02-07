package transport;

// Реализация интерфейса для Car
public class Car implements Transport{
    // Константы
    public static final int MAX_SPEED = 200; // Максимальная скорость (константа)
    public static final String DEFAULT_COLOR = "Black"; // Цвет по умолчанию (константа)
    public static final String DEFAULT_TYPE = "C"; // Цвет по умолчанию (константа)

    // Статические поля
    private static int TOTAL_CARS = 0; // Общее количество машин
    private static double TOTAL_MILEAGE = 0; // Общий пробег всех машин

    // Поля экземпляра
    private String type;
    private String color;
    private int mileage;

    // Конструктор
    public Car() {
        this.type = DEFAULT_TYPE;
        this.color = DEFAULT_COLOR;
        this.mileage = 0;
        TOTAL_CARS++;
    }

    @Override
    public String getType() {
        return "Car";
    }

    // Getter и Setter для цвета
    public String getColor() {
        return color;
    }

    // Getter и Setter для пробега
    public int getMileage() {
        return mileage;
    }


    // Getter для общего количества машин
    public static int getTOTAL_CARS() {
        return TOTAL_CARS;
    }

    // Getter для общего пробега
    public static double getTOTAL_MILEAGE() {
        return TOTAL_MILEAGE;
    }

    @Override
    public void setType(String type) {
        this.color = type;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

//    public stat void main(String[] args) {
//        // Пример использования класса Car
//        Car car1 = new Car();
//        car1.setColor("Red");
//        car1.setMileage(150.5);
//
//        Car car2 = new Car();
//        car2.setColor("Blue");
//        car2.setMileage(200.3);
//
//        System.out.println("Car 1 - Color: " + car1.getColor() + ", Mileage: " + car1.getMileage());
//        System.out.println("Car 2 - Color: " + car2.getColor() + ", Mileage: " + car2.getMileage());
//
//        System.out.println("Total Cars: " + Car.getTOTAL_CARS());
//        System.out.println("Total Mileage: " + Car.getTOTAL_MILEAGE());
//    }
}
