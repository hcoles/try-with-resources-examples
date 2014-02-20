package me.artspb.pitest.examples.twr.example1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author Artem Khvastunov
 */
public class TryExample {

    public static void main(String[] args) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            baos.flush();
        }
    }
}
