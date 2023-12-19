package com.ivoyant;

import java.util.Date;
import java.util.List;

public class CourierDetails {
    public String courierId;
    public String senderName;
    public String receiverName;
    public String senderAddress;
    public String receiverAddress;
    public String fromAddress;
    public String toAddress;
    public double weight;
    public Date bookingDate;
    public double courierCost;
    public List<String> locations;
    public double distance;

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public void setCourierId(String courierId) {
        this.courierId = courierId;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setCourierCost(double courierCost) {
        this.courierCost = courierCost;
    }

    public double calculateCost() {
        return 50.0 + (distance * 50.0 * weight);
    }
}
