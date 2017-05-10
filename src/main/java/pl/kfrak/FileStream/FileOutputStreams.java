package pl.kfrak.FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by RENT on 2017-05-10.
 */

//FileOutputStream - najprostszy sposób zapisywania do pliku
public class FileOutputStreams {
    public static void main(String[] args) throws IOException {
        //nadpisujemy
        FileOutputStream outputStream = new FileOutputStream("number.txt");
        outputStream.write(97);
        outputStream.write(98);
        outputStream.write(99);
        //każdy strumie n trezba zamknąć, bo blokujemy ten zasów na który strumień wskazuje
        //jesli stworzymy nowy plik, którego strumień wskazuje na ten sam plik number.txt to się wywali
        outputStream.close();

        //dodajemy, updatejumy
        FileOutputStream outputStreamAppleading = new FileOutputStream("number.txt", true);
        outputStreamAppleading.write(98);
        outputStreamAppleading.write(98);
        outputStreamAppleading.write(98);
        outputStreamAppleading.close();

        //zadanie: napisac caly alfabet
        FileOutputStream outputStreamAlphabet = new FileOutputStream("alphabet.txt", true);

        for (int i = 97; i < 122; i++) {
            outputStreamAlphabet.write(i);
        }
        outputStreamAlphabet.write('\n');
        for (int i = 'A'; i < 'Z'; i++) {
            outputStreamAlphabet.write(i);
        }
        outputStreamAppleading.close();

        //zapisanie stringa do pliku z uzyciem FileOutputStream
        FileOutputStream fileOutputStream = new FileOutputStream("ala.txt");

        String text = "Ala ma kota";
        byte[] bytes = text.getBytes();
        fileOutputStream.write(bytes);

        //LUB
        fileOutputStream.write("Ala ma kota".getBytes());

        fileOutputStream.close();
    }
}
