package com.ivoyant;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello!!\nWelcome To XCouriers");
        CourierDetails courierDetails = CourierInput.inputDetails();
        System.out.println("\t\tThe Booking Summary");
        System.out.println("---------------------------------------------------------");
        System.out.println("Courier ID : " + courierDetails.receiverAddress);
        System.out.println("Booking Date : " + courierDetails.bookingDate);
        System.out.println("Sender Name : " + courierDetails.senderName);
        System.out.println("Receiver Name : " + courierDetails.receiverName);
        System.out.println("Sender Address : " + courierDetails.senderAddress);
        System.out.println("Receiver Address : " + courierDetails.receiverAddress);
        System.out.println("From Address : " + courierDetails.fromAddress);
        System.out.println("To Address : " + courierDetails.toAddress);
        System.out.println("Courier Weight : " + courierDetails.weight);
        System.out.println("Total Courier Cost : " + courierDetails.courierCost);
    }
}
