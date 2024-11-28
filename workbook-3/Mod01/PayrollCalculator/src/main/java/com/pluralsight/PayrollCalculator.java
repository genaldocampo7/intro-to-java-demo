package com.pluralsight;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;
            input = bufferedReader.readLine();
            while ((input = bufferedReader.readLine()) != null) {
                String[] data = input.split("\\|");
                Employee employee = new Employee(Integer.parseInt(data[0]), data[1], Float.parseFloat(data[2]), Float.parseFloat(data[3]));
                System.out.printf("Employee: %s, Employee ID: %d, Gross Pay: $%.2f\n", employee.getName(), employee.getEmployeeID(), employee.getGrossPay());
            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Invalid File");
            e.printStackTrace();

        }

        System.out.println("Enter the name of the employee file to process: ");
        String fileName = scanner.nextLine();
        System.out.println("Enter name of the payroll file to create: ");
        String payRoll = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter( "employees.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String text;
            fileWriter.write("employees: \n");
            fileWriter.write();

            for ()






        }

        }
}












