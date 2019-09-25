package ex;
import java.util.*;
//import java.io.*;
public class StudentMarks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = input.nextInt();
        System.out.println("Enter their grades:");


        int[] grad = new int[n];
//        try {
        int c=0;
            for (int i = 0; i < n; i++) {
                c = input.nextInt();

                    if (c< 0 || c > 100) {
                        try {
                            //System.out.println("Inside exception ");
                            throw new MyException("Errroorr");
                        }
                        catch (MyException e){
                            System.out.println("Error"+e);
                            i--;
                        }
                    }
                    else
                       grad[i] = c;

            }
       System.out.println("Grades are:");
        for(int i=0;i<n;i++)
            System.out.println(grad[i]);
    }
}
class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}