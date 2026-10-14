package org.example;

public class Employee {


    public String name;
    public double baseSalary;
    public double bonus;

    public double finalSalary(){
        double totalSalary = baseSalary + bonus;
        return totalSalary;
    };

    public double missingSalary(){
        double miss = 3000 - finalSalary();
        return miss;
    }
}
