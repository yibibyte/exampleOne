package transport;

import java.util.Objects;

// Другая реализация интерфейса для Bicycle
public class Bicycle implements Transport{
    private static final String DEFAULT_COLOR = "Silver";
    private String color;
    private int mileage;
    private String type;

    public Bicycle() {
        this.color = DEFAULT_COLOR;
        this.mileage = 0;
    }

    public Bicycle(String color, int mileage, String type) {
        this.color = color;
        this.mileage = mileage;
        this.type = type;
    }

    @Override
    public String getType() {
        return "Bicycle";
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getMileage() {
        return mileage;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "color='" + color + '\'' +
                ", mileage=" + mileage +
                ", type='" + type + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return mileage == bicycle.mileage && Objects.equals(color, bicycle.color) && Objects.equals(type, bicycle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, mileage, type);
    }

    @Override
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
