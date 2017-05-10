package pl.kfrak.FileStream;

import com.google.common.io.Files;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-05-10.
 */
public class JavaIORest {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("a.txt");
        fileWriter.write("Ala ma kota");

        fileWriter.flush();
        fileWriter.close();

        FileWriter fileWriterAppend = new FileWriter("a.txt", true);
        fileWriter.write("Ala ma kota");

        fileWriter.flush();
        fileWriter.close();

        //nie polecam
        FileReader fileReader = new FileReader("a.txt");
        fileReader.read();
        fileReader.close();

        //Scanner
        FileInputStream fileInputStream = new FileInputStream("a.txt");
        Scanner scanner = new Scanner(fileInputStream);

        String line = scanner.nextLine();
        scanner.next();

        fileInputStream.close();

        // PrintStream
        PrintStream printStream = new PrintStream(new FileOutputStream("b.txt"));
        printStream.println("ABC");

    }
}
