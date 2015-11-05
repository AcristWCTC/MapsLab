/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Adam
 */
public class Lab4 {

    public static void main(String[] args) {

        Employee e1 = new Employee("1", "Nana", "Bob", "304-11-9246");
        Employee e2 = new Employee("3", "Falsa", "Tim", "123-44-9215");
        Employee e3 = new Employee("4", "Beleran", "Joe", "304-11-9246");
        Employee e4 = new Employee("2", "Bolas", "Susie", "669-25-7813");

        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        

        for (Employee e : employeeSet) {
            System.out.println(e);
        }
        System.out.println(" ");

        List<Employee> list = new ArrayList<>(employeeSet);
        Collections.sort(list, new EmployeeByFirstName());
        for (Employee e : list) {
            System.out.println(e);
        }
    }

}
