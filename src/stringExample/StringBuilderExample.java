package stringExample;

public class StringBuilderExample {

    public static void main(String[] args) {
        // Создаем объект StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // Добавляем строки
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World");

        // Преобразуем в строку и выводим
        String result = stringBuilder.toString();
        System.out.println(result);
    }
}
