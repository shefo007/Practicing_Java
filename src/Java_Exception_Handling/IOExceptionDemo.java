package Java_Exception_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {

    public static void main(String[] args) {

        String filepath = "C:\\Users\\SingVi04\\Desktop\\IOTest1.txt";
        BufferedReader br1 = null;
        String curLine;

        try {
            br1 = new BufferedReader(new FileReader(filepath));

            while ((curLine = br1.readLine()) != null) {
                System.out.println(curLine);
            }
        } catch (IOException e) {
            System.err.println("IOException found :" + e.getMessage());
        } finally {
            try {
                if (br1 != null)
                    br1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
