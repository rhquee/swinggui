package pl.kfrak.FileStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by RENT on 2017-05-10.
 */
public class FileInputStream2 {
    public static void main(String[] args) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("ala.txt");
//
//        int read = fileInputStream.read();
//        System.out.println((char)read);
//        System.out.println((char)read);

        //lub
        //System.out.println((char)fileInputStream.read());


//        for (int i = 0; i <  ; i++) {
//            System.out.println((char)fileInputStream.read());
//        }

//        while (true) {
//            int read = fileInputStream.read();
//            if (read >= 0) {
//                System.out.println((char) read);
//            } else {
//                break;
//            }
//        }
//
//        //lub
//        int read;
//        while(( read = fileInputStream.read()) > 0) {
//            System.out.println((char)read);
//        }
//        fileInputStream.close();

        //zadanie: z pliku "number" wypisac trzykrotnośc liczby, która tam jest

        FileInputStream fileNumber = new FileInputStream("number.txt");

        int numberCode = fileNumber.read();
        int number = numberCode - 48;
        System.out.println(number * 3);

        fileNumber.close();

        //zadanie trudniejsze
        //mam "1542" w numbers i na podstawie int,ów chce przeczytac liczbe
        //2 * 1 + 4 * 10 + 5 * 100 + 1 * 1000

        //zadanie łatwiejsze
        //przeczytać cały plik do Stringa - plik alphabet
        FileInputStream alphaString = new FileInputStream("alphabet.txt");
        int read;
//        String text = "";
//
//        while(( read = alphaString.read()) > 0) {
//            text += (char)read;
//            //konkatynacja stringów - łączenie stringów za pomocą += w pętli
//        }
//
//        System.out.println(text);


        //powyzsze jest zasobozerne! tworzy sie mnostwo obiektow
        //zamiast tego jest stringBuilder

        StringBuilder stringBuilder = new StringBuilder();
        while((read = alphaString.read()) > 0) {
            stringBuilder.append((char)read);
        }
        String text = stringBuilder.toString();
        System.out.println(text);
        alphaString.close();


    }
}
