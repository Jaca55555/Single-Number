package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CelectionSort {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Downloads\\What is telematics_.mp4");
        System.out.println(file.exists());
        byte[] b = new byte[100];
        try (FileInputStream fileInputStream = new FileInputStream(file);
             FileOutputStream fileWriter = new FileOutputStream("D:\\" + file.getName())
        ) {
            while ((fileInputStream.read(b)) != -1) fileWriter.write(b);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
