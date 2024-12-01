package object.finalize;

/**
 * finalize() (устаревший метод).
 * Метод finalize() используется для выполнения завершающих операций перед уничтожением объекта сборщиком мусора.
 * Этот метод был помечен как устаревший, и его не рекомендуется использовать,
 * так как он может быть неожиданно вызван сборщиком мусора.
 * В новых приложениях лучше использовать try-with-resources и другие механизмы управления ресурсами.
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println(name + " is being destroyed");
        } finally {
            super.finalize();
        }
    }
}
