package stringExample;

public class MainStringPool {
    public static void main(String[] args) {

        String s1 = "Cat";

        String s2 = "Cat";

        String s3 = new String("Cat");


        // сравниваем наши строки

        System.out.println("s1 == s2 : " + (s1 == s2));

        System.out.println("s1 == s3 : " + (s1 == s3));

        String str1 = "Hello World";
        String str2 = new String("Hello World");
        System.out.println(str1 == str2);
        String str3 = str2.intern();
        System.out.println(str1 == str3);


    }
}
