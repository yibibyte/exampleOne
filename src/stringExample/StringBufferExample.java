package stringExample;

public class StringBufferExample {

    public static void main(String[] args) {
        String string = "New";
        String stringNew = string;

        int i = 7;

        // Создаем объект StringBuffer
        StringBuffer stringBuffer = new StringBuffer();

        // Добавляем строки
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");

        // Преобразуем в строку и выводим
        String result = stringBuffer.toString();
        System.out.println(result);
    }
}
