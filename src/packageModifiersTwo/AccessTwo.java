package packageModifiersTwo;

import packageModifiersOne.Modifiers;

public class AccessTwo {
    public static void main(String[] args) {

        Modifiers objectModifiers = new Modifiers();

        System.out.println(objectModifiers.publicVar);
//        System.out.println(objectModifiers.protectedVar);
//        System.out.println(objectModifiers.defaultVar);
    }
}
