package stat;

public class OuterClass {
    // Вложенный статический класс
    static class InnerStaticClass {
        void printMessage() {
        }

        // Обращение к вложенному статическому классу
        OuterClass.InnerStaticClass innerStaticObject = new OuterClass.InnerStaticClass();
    }
}
