package recursion;

public class StartRecursion {
    public static void main(String[] args) {

        Recursion recursion = new Recursion();
        //recursion.hashCode();

       // stackOverflow(); // stack overflow
    }
    public static String stackOverflow() {
        return stackOverflow();
    }
}
