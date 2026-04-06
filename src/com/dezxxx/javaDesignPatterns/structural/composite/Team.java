package com.dezxxx.javaDesignPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team  {

    private String companyName;
    private List<Employee> employees = new ArrayList<>();

    public Team(String companyName) {
        this.companyName = companyName;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void createInternetProvider() {
        System.out.println("--------Internet provider created------");
        for (Employee employee : employees) {
            employee.service();
        }
    }

}




