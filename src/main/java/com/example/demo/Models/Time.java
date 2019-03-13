package com.example.demo.Models;

public class Time {

    private int idTime;
    private int sTime;
    private int eTime;
    private boolean isBooked;

    public Time(int idTime, int sTime, int eTime, boolean isBooked) {
        this.idTime = idTime;
        this.sTime = sTime;
        this.eTime = eTime;
        this.isBooked = isBooked;
    }

    public Time() {

    }

    public Time(int sTime, int eTime, boolean isBooked) {
        this.sTime = sTime;
        this.eTime = eTime;
        this.isBooked = isBooked;
    }

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
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

    @Override
    public String toString() {
        return "Time{" +
                "idTime=" + idTime +
                ", sTime=" + sTime +
                ", eTime=" + eTime +
                ", isBooked=" + isBooked +
                '}';
    }
}
