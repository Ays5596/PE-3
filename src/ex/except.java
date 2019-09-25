package ex;
import java.util.*;
import java.io.*;

public class except {

    public static void main(String [] args){
        System.out.println("Enter number more than 11:");
        int i=7;
        try{
            if(i<=11){
                throw new My1Exception("errorr");
            }
        }
        catch(My1Exception e){
                System.out.println("Must be more than 11");
        }
        finally {
            System.out.println("Reaches Finally");
        }
    }
}
class My1Exception extends Exception{
    public My1Exception(String msg){
        super(msg);
    }
}