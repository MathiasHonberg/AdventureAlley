package com.example.demo.Models;

public class Time {

    private int idTime;
    private String dateTime;
    private int sTime;
    private int eTime;
    private boolean isBooked;
    private int ida;

    public Time(int idTime, String dateTime, int sTime, int eTime, boolean isBooked, int ida) {
        this.idTime = idTime;
        this.dateTime = dateTime;
        this.sTime = sTime;
        this.eTime = eTime;
        this.isBooked = isBooked;
        this.ida = ida;
    }

    public Time(int idTime, String dateTime, int sTime, int eTime, boolean isBooked) {
        this.idTime = idTime;
        this.dateTime = dateTime;
        this.sTime = sTime;
        this.eTime = eTime;
        this.isBooked = isBooked;
    }

    public Time() {

    }

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getsTime() {
        return sTime;
    }

    public void setsTime(int sTime) {
        this.sTime = sTime;
    }

    public int geteTime() {
        return eTime;
    }

    public void seteTime(int eTime) {
        this.eTime = eTime;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getActivity() {
        return ida;
    }

    public void setActivity(int activity) {
        this.ida = activity;
    }

    @Override
    public String toString() {
        return "Time{" +
                "idTime=" + idTime +
                ", dateTime='" + dateTime + '\'' +
                ", sTime=" + sTime +
                ", eTime=" + eTime +
                ", isBooked=" + isBooked +
                ", ida=" + ida +
                '}';
    }
}
