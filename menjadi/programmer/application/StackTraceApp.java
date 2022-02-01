package menjadi.programmer.application;

public class StackTraceApp {

    public static void main(String[] args) {
        try {
            String[] names = {
                "Agung", "Maulana"
            };

            System.out.println(names[1]);
        } catch (Throwable throwable) {
            // StackTraceElement[] stackTraceElements = throwable.getStackTrace();
            throwable.printStackTrace();
        }

        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
       
    }

    public static void sampleError() {
        try {
            String[] names = {
                "Agung", "Maulana"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
    
}
