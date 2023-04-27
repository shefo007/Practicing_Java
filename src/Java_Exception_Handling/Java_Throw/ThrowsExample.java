package Java_Exception_Handling.Java_Throw;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsExample {

    public static void findFile() throws IOException {

        File file= new File("C:\\test.txt");
        FileInputStream stream = new FileInputStream(file);

    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
