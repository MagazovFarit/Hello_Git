package MainPackage;

import java.io.*;

public class MainClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello GitHub!!!");
        Cat cat1 = new Cat("Kotya", 14);
        System.out.println(cat1.name);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        cat1.name = reader.readLine();
        System.out.println(cat1.name);

        String text;
        while (!(text = reader.readLine()).isEmpty()){
            System.out.println(text);
        }

    }
}
