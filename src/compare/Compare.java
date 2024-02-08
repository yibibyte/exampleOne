package compare;

import compare.Employee;

import java.util.HashSet;
import java.util.Set;

public class Compare {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setId(100);
        e2.setId(100);

        //Печатает false в консоли
        System.out.println(e1.equals(e2));

        /*
        Set employees = new HashSet();
        employees.add(e1);
        employees.add(e2);
        //Печатает два объекта
        System.out.println(employees);
        */

    }
}
