import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

/**
 * Created by abhijith.nagarajan on 2/18/15.
 */
public class Xlsx {

    public static void main(String[] args) throws Exception {

        Path path = Paths.get("test.xls");

        System.out.println(path.toAbsolutePath().toString());

        Path file = Files.createFile(path);

        String tabSeparated = "1\t2\t3\t";

        Files.write(file, tabSeparated.getBytes());
    }
}
