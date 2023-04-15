package com.practice.corejava;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapNestedClassEmployeeExample {
    Map<Integer,Employee> mapEmp = new HashMap<>();
    Employee emp1 = new Employee("Vaibhav Shukla","123422", new EmployeeAddress("Sector-83", "Gurgaon", 122004, "HR"));
    Employee emp2 = new Employee("Vaibhav Shukla1","123423", new EmployeeAddress("Sector-84", "Gurgaon", 122005, "HR"));
    Employee emp3 = new Employee("Vaibhav Shukla2","123424", new EmployeeAddress("Sector-85", "Gurgaon", 122006, "HR"));
    Employee emp4 = new Employee("Vaibhav Shukla3","123425", new EmployeeAddress("Sector-86", "Gurgaon", 122007, "HR"));
    @Test
    public void testMethod(){
        mapEmp.put(1000,emp1);
        mapEmp.put(1500,emp2);
        mapEmp.put(2000,emp3);
        mapEmp.put(2500,emp4);
        System.out.println(mapEmp);
        System.out.println("Full Name: "+mapEmp.get(1000).getFullName());
        System.out.println("Employee Id: "+mapEmp.get(1000).getEmpId());
        System.out.println("Address Sector: "+mapEmp.get(1000).getAddress().getSector());
        System.out.println("Address City: "+mapEmp.get(1000).getAddress().getCity());
        System.out.println("Address Pin Code: "+mapEmp.get(1000).getAddress().getPinCode());
        System.out.println("Address State: "+mapEmp.get(1000).getAddress().getState());
    }

}
