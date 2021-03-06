package me.artspb.pitest.examples.twr.example2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author Artem Khvastunov
 */
public class TryCatchExample {

    public static void main(String[] args) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            baos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
