package menjadi.programmer.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {

    public static void main(String[] args) {
        // BufferedReader reader = null;

        // // close manual
        // try {
        //     reader = new BufferedReader(
        //             new FileReader("README.md"));
        //     while (true) {
        //         String line = reader.readLine();
        //         if (line == null) {
        //             break;
        //         }

        //         System.out.println(line);
        //     }

        // } catch (Throwable throwable) {
        //     System.out.println("Error membaca file " + throwable.getMessage());
        // } finally {
        //     if (reader != null) {
        //         try {
        //             reader.close();
        //             System.out.println("Sukses menutup");
        //         } catch (IOException exception) {
        //             System.out.println("Error menutup resource " + exception.getMessage());
        //         }
        //     }
        // }

        // try with resource, otomatis close
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }

                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error membaca file " + throwable.getMessage());
        }
    }

}