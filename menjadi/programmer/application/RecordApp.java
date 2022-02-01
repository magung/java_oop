package menjadi.programmer.application;

import menjadi.programmer.data.LoginRequest;

public class RecordApp {

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("agung", "rahasia");
        System.out.println(loginRequest);
        System.out.println(loginRequest.username());    
        System.err.println(loginRequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("agung"));
        System.out.println(new LoginRequest("agung", "rahasia"));
    }
    
    
    
}
