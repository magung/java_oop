package menjadi.programmer.application;

import menjadi.programmer.data.LoginRequest;
import menjadi.programmer.error.ValidationException;
import menjadi.programmer.util.ValidationUtil;

public class ValidationApp {

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("agung", "rahasia");
        // LoginRequest loginRequest = new LoginRequest(null, null);

        // try {
        //     ValidationUtil.validate(loginRequest);
        //     System.out.println("Data valid");
        // } catch (ValidationException e) {
        //     System.out.println("Data tidak valid : " + e.getMessage());
        // } catch (NullPointerException e) {
        //     System.out.println("Data null : " + e.getMessage());
        // }

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Data tidak valid : " + e.getMessage());
        } finally {
            System.out.println("Selalu dieksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);// akan berhenti jika error
        System.out.println("Sukses");
    }
    
}
