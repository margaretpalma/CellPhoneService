package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();

        System.out.print("What is the serial number?: ");
        int sn = scanner.nextInt();
        scanner.nextLine();

        myPhone.setSerialNumber(sn);

        System.out.print("What is the model?: ");
        String model = scanner.nextLine();

        myPhone.setModel(model);

        System.out.print("What is the carrier?: ");
        String carrier = scanner.nextLine();

        myPhone.setCarrier(carrier);

        System.out.print("What is the phone number?: ");
        String phoneNumber = scanner.nextLine();

        myPhone.setPhoneNumber(phoneNumber);

        System.out.print("What is the owner?: ");
        String owner = scanner.nextLine();
        myPhone.setOwner(owner);


        myPhone.dial("555-555-5555");

        scanner.close();
    }
}

