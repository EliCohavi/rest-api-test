package com.example.restapitest;

public class GreetingRequest {
    private String name;
    private String city;

    public GreetingRequest() { // no args constructor
        this.name = "Eli";
        this.city = "Leawood";
    }

    public String getName() {
        return name;
    } // getter

    public void setName(String name) {
        this.name = name;
    } // setter

    public String getCity() {
        return city;
    } // getter

    public void setCity(String city) {
        this.city = city;
    } // setter


}
