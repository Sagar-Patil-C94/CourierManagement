package com.ivoyant;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CourierInput {
    public static CourierDetails inputDetails() {
        int i = 1, locationInput;
        Scanner scanner = new Scanner(System.in);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        CourierDetails courierdetails = (CourierDetails) context.getBean("courierdetails");
        List<String> locations = courierdetails.locations;
        System.out.println("Enter Sender Name : ");
        courierdetails.setSenderName(scanner.nextLine());
        System.out.println("Enter Receiver Name : ");
        courierdetails.setReceiverName(scanner.nextLine());
        System.out.println("Enter Sender Address : ");
        courierdetails.setSenderAddress(scanner.nextLine());
        System.out.println("Enter Receiver Address : ");
        courierdetails.setReceiverAddress(scanner.nextLine());
        System.out.println("..............\nSelect From Address :\n");
        for (String address : locations) {
            System.out.print(i++);
            System.out.println("." + address);
        }
        locationInput = scanner.nextInt();
        scanner.nextLine();
        courierdetails.setFromAddress(locations.get(locationInput - 1));
        locations.remove(locationInput - 1);
        System.out.println("..............\nSelect To Address :\n");
        i = 1;
        for (String address : locations) {
            System.out.print(i++);
            System.out.println("." + address);
        }
        locationInput = scanner.nextInt();
        scanner.nextLine();
        courierdetails.setToAddress(locations.get(locationInput - 1));
        System.out.println("Enter Weight : ");
        courierdetails.setWeight(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Enter Total Distance : ");
        courierdetails.setDistance(scanner.nextDouble());
        scanner.nextLine();
        LocalDate localDate = LocalDate.now();
        Date date = java.sql.Date.valueOf(localDate);
        courierdetails.setBookingDate(date);
        courierdetails.setCourierId(GetID.id(courierdetails.getFromAddress(), courierdetails.getToAddress()));
        courierdetails.setCourierCost(courierdetails.calculateCost());
        return courierdetails;
    }
}