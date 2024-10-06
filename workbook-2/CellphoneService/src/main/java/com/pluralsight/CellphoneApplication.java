package com.pluralsight;

import java.util.Scanner;


public class CellphoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Cellphone cellphone1 = createCellPhone();
        Cellphone cellphone2 = createCellPhone();

        display(cellphone1);
        display(cellphone2);

        cellphone1.dial(cellphone2.getPhoneNumber());
    }

    public static void display(Cellphone info) {
        System.out.println(info.getModel() + " | " + info.getCarrier() + " | " + info.getOwner() + " | " + info.getPhoneNumber() + " | " + info.getSerialNumber());
    }

    public static Cellphone createCellPhone() {
        Cellphone info = new Cellphone();

        System.out.println("What is the serial number?");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        info.setSerialNumber(serialNumber);

        System.out.println("What model is the phone?");
        String model = scanner.nextLine();
        info.setModel(model);

        System.out.println("Who is the carrier?");
        String carrier = scanner.nextLine();
        info.setCarrier(carrier);

        System.out.println("What is the phone number?");
        String phoneNumber = scanner.nextLine();
        info.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine();
        info.setOwner(owner);


            return info;
        }
    }


