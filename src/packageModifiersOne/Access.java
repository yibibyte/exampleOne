package packageModifiersOne;

public class Access {
    public static void main(String[] args) {

        Modifiers objectModifiers = new Modifiers();

        int defaultVar = objectModifiers.defaultVar;
        int protectedVar = objectModifiers.protectedVar;
        int publicVar = objectModifiers.publicVar;

        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}
