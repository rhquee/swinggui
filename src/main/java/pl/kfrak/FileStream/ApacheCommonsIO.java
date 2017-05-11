package pl.kfrak.FileStream;

import com.google.common.base.Charsets;
import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.SizeFileComparator;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by RENT on 2017-05-11.
 */
public class ApacheCommonsIO {
    public static void main(String[] args) throws IOException{
        //Przeczytanie wszytskich linii z pliku
        List<String> stringList = FileUtils.readLines(new File("test.txt"), Charsets.UTF_8);

        //Sortowanie po rozmiarze
        SizeFileComparator sizeFileComparator = new SizeFileComparator();
        File[] files = {new File("a.txt"), new File("b.txt")};
        sizeFileComparator.sort(files);

        //sizeFileComparator.compare();

      //  long freeSpaceKb = FileSystemUtils.freeSpaceKb()("c:\\");

        FileUtils.cleanDirectory(new File("myDir"));



    }
}
