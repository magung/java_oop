package menjadi.programmer.application;

import menjadi.programmer.data.CreateUserRequest;
import menjadi.programmer.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("agung");
        request.setPassword("rahasia");
        request.setName("agung");
        ValidationUtil.validationReflection(request);
    }
    
}
