package src.Exercise.Decorator;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(
                    "C:\\Users\\anhhu\\Desktop\\OOP_Learning\\src\\Exercise\\Decorator\\ToLowerCase\\text.txt")));

            while ((c = in.read()) > 0) {
                System.out.println((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
