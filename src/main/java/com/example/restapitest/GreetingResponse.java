package com.example.restapitest;

public class GreetingResponse {
    private String message; //defining variable

    public GreetingResponse() {} //creating no args constructor for class

    public GreetingResponse(String message) { //creating constructor that takes message
        this.message = message; // refs current instance of message
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
