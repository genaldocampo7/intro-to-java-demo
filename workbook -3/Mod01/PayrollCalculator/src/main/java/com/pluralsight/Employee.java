package com.pluralsight;
public class Employee {
    private int employeeID;
    private String name;
    private float hoursWorked;
    private float payRate;

    public Employee(int employeeID, String name, float hoursWorked, float payRate ) {
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public float getGrossPay() {
        return hoursWorked*payRate;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public int getEmployeeID () {
            return employeeID;
        }

        public String getName () {
            return name;
        }

        public float getHoursWorked () {
            return hoursWorked;
        }

        public float getPayRate () {
            return payRate;
        }
    }