package pl.kfrak.FileStream;

import java.io.IOException;

/**
 * Created by RENT on 2017-05-10.
 */
public class StringBuilderPerfomance {
    public static void main(String[] args) throws IOException {

        long start = System.nanoTime();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000_000; i++) {
            stringBuilder.append(i);
        }

        double duration = (System.nanoTime() - start) / 1_000_000_000d;
        System.out.println("Czas trwania - StringBuilder: " + duration);

        start = System.nanoTime();

        String text = "";
        for (int i = 0; i < 1000_000; i++) {
            text += i;
        }

        duration = (System.nanoTime() - start) / 1_000_000_000d;
        System.out.println("Czas trwania - String: " + duration);

    }
}
