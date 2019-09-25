package ex;

import java.io.*;
import java.io.IOException;
public class DemoFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("hello.txt");
        System.out.println("filename "+file);
        System.out.println("fileexist "+file.exists());
        System.out.println("filepath "+file.isDirectory());

        /*String contowrite = "hello world";
        OutputStream os = new FileOutputStream(file);
        os.write(contowrite.getBytes());
        os.close();*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
       // String firstline = reader.readLine();
        //reader.close();
        //System.out.println(firstline);

    }
}
