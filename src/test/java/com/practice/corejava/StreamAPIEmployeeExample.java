package com.practice.corejava;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIEmployeeExample {

    @Test
    public void testMethod(){
    Employee emp1 = new Employee("Vaibhav Shukla","123422", new EmployeeAddress("Sector-83", "Gurgaon", 122004, "HR"));
    Employee emp2 = new Employee("Vaibhav Shukla1","123423", new EmployeeAddress("Sector-84", "Gurgaon", 122005, "HR"));
    Employee emp3 = new Employee("Vaibhav Shukla2","123424", new EmployeeAddress("Sector-85", "Gurgaon", 122006, "HR"));
    Employee emp4 = new Employee("Vaibhav Shukla3","123425", new EmployeeAddress("Sector-86", "Gurgaon", 122007, "HR"));
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(emp1);
    employeeList.add(emp2);employeeList.add(emp3);
    employeeList.add(emp4);
    System.out.println(employeeList);
    List<Employee> employeeFilList  = employeeList.stream().filter(employee -> employee.getAddress().getPinCode().equals(122006)).collect(Collectors.toList());
        //employeeList.stream().filter(
    Employee filteredEmp = employeeFilList.get(0);
    System.out.println(filteredEmp.getFullName());

    }

}

class Employee{
    private String fullName;
    private String empId;

    public String getFullName() {
        return fullName;
    }

    public String getEmpId() {
        return empId;
    }

    public EmployeeAddress getAddress() {
        return address;
    }

    private EmployeeAddress address;

    public Employee(String fullName, String empId, EmployeeAddress address) {
        this.fullName = fullName;
        this.empId = empId;
        this.address = address;
    }
}

class EmployeeAddress{
    private String sector;
    private String city;
    private Integer pinCode;
    private String state;

    public EmployeeAddress(String sector, String city, Integer pinCode, String state) {
        this.sector = sector;
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
    }

    public String getSector() {
        return sector;
    }

    public String getCity() {
        return city;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public String getState() {
        return state;
    }
}
