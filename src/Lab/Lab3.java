/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Adam
 */
public class Lab3 {

    public static void main(String[] args) {

        Employee e1 = new Employee("4", "Doe", "John", "333-33-3333");
        Employee e2 = new Employee("1", "Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee("3", "Jones", "Bob", "444-44-4444");
        Employee e4 = new Employee("2", "Mallay", "Fred", "333-33-3333");

        Map<String, Employee> employees = new TreeMap<>();
        employees.put(e2.getEmpID(), e2);
        employees.put(e4.getEmpID(), e4);
        employees.put(e3.getEmpID(), e3);
        employees.put(e1.getEmpID(), e1);

        Set keys = employees.keySet();
        for (Object key : keys) {
            System.out.println(key);
        }
        
        System.out.println(" ");
        
        Collection<Employee> emps = employees.values();
        List<Employee> sortedList = new ArrayList<Employee>(emps);
        Collections.sort(sortedList, new EmployeeByFirstName());
        for(Employee emp : sortedList) {
            System.out.println(emp);
        }
    }
}
