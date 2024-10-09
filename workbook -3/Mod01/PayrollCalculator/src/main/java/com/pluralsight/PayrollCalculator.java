package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class Employee {
    public static void main(String[] args) {
        int employeeID;
        String name;
        int hoursWorked;
        int payRate;

        public Employee(int employee, String name, int hoursWorked, int payRate ) {
        this.employee = employee;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;



        try {
            FileReader fileReader = new FileReader(Employee);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        }












    }
}
