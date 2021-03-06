package com.example.demo.Models;

public class Booking {

    private int idBooking;
    private String name;
    private String email;
    private int participants;
    private int phoneNumber;
    private int idTime;

    public Booking(int idBooking, String name, String email, int participants, int phoneNumber, int idTime) {
        this.idBooking = idBooking;
        this.name = name;
        this.email = email;
        this.participants = participants;
        this.phoneNumber = phoneNumber;
        this.idTime = idTime;
    }

    public Booking(int idBooking, String name, String email, int participants, int phoneNumber) {
        this.idBooking = idBooking;
        this.name = name;
        this.email = email;
        this.participants = participants;
        this.phoneNumber = phoneNumber;
    }

    public Booking() {

    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", participants=" + participants +
                ", phoneNumber=" + phoneNumber +
                ", idTime=" + idTime +
                '}';
    }
}
