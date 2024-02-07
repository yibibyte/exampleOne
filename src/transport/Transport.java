package transport;

// Интерфейс Transport
public interface Transport {
    String getType(); // Получить тип транспорта
    String getColor(); // Получить цвет транспорта
    int getMileage(); // Получить пробег транспорта

    void setType(String type);    // Изменить тип транспорта
    void setColor(String color);   // Изменить цвет транспорта
    void setMileage(int mileage); // Изменить пробег транспорта
}
