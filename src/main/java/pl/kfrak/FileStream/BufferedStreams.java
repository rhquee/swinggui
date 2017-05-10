package pl.kfrak.FileStream;

import java.io.*;

/**
 * Created by RENT on 2017-05-10.
 */
public class BufferedStreams {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("a.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        StringBuilder stringBuilder = new StringBuilder();
        int read;
        while ((read = bufferedInputStream.read()) > 0) {
            stringBuilder.append((char) read);
        }

        System.out.println(stringBuilder.toString());

        bufferedInputStream.close();
        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream("b.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        bufferedOutputStream.write('A');
        bufferedOutputStream.write('B');
        bufferedOutputStream.write('C');
        bufferedOutputStream.write('D');

        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();

    }

}
