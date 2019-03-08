package com.example.demo.Models;


public class Activity {

    private int id;
    private String title;
    private String description;
    private int age;
    private double price;
    private int startTime;
    private int endTime;
    private String picture;

    public Activity() {

    }

    public Activity(int id, String title, String description, int age, double price, int startTime, int endTime, String picture) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.age = age;
        this.price = price;
        this.startTime = startTime;
        this.endTime = endTime;
        this.picture = picture;
    }

    public Activity(int id, String title, String description, int age, double price, int startTime, int endTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.age = age;
        this.price = price;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", picture='" + picture + '\'' +
                '}';
    }
}

