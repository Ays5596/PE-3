package ex;
import java.util.*;
import java.io.*;
public class readContent {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter filename");
        Scanner input = new Scanner(System.in);
        String fileName = input.next();
        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String read;
        while((read = reader.readLine())!=null) {
            System.out.println(read);
            System.out.println(read.toUpperCase());
        }
    }
}
