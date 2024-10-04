package com.pluralsight;

import java.util.Scanner;

public class CellphoneApplication {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("What is the serial number?");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What model is the phone?");
        String model = scanner.nextLine();

        System.out.println("Who is the carrier?");
        String carrier = scanner.nextLine();

        System.out.println("What is the phone number?");
        String phoneNumber = scanner.nextLine();

        System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine();

       Cellphone info = new Cellphone();

       info.setSerialNumber(serialNumber);
       info.setModel(model);
       info.setCarrier(carrier);
       info.setPhoneNumber(phoneNumber);
       info.setOwner(owner);

        System.out.println("Serial Number: " +info.getSerialNumber());
        System.out.println("Model: " +info.getModel());
        System.out.println("Carrier: " +info.getCarrier());
        System.out.println("Phone Number: " +info.getPhoneNumber());
        System.out.println("Owner: " +info.getOwner());
        scanner.close();
    }
}
