/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.maps;

import common.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Adam
 */
public class ListOfMapsDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2, "Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee(3, "Jones", "Bob", "444-44-4444");
        
        
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        

        List<Map<String, Object>> records = new ArrayList<>();
        
        Map<String,Object> genericObject = new HashMap<>();
        genericObject.put("empID", 1);
        genericObject.put("lastName", "Doe");
        genericObject.put("firstName", "John");
        genericObject.put("ssn", "333-33-3333");
        
        records.add(genericObject);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

//    
//        Employee e1 = new Employee(1,"Doe", "John", "333-33-3333");
//        Employee e2 = new Employee(2,"Smith", "Sally", "111-11-1111");
//        Employee e3 = new Employee(3,"Jones","Bob", "444-44-4444");
//        
//        Map<String,Employee> employees = new HashMap<>();
//        employees.put(e1.getSsn(), e1);
//        employees.put(e2.getSsn(), e2);
//        employees.put(e3.getSsn(), e3);
//        
//        Employee e = employees.get("333-33-3333");
//        System.out.println(e);
    }
}
