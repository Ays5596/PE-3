package ex;
import javax.print.DocFlavor;
import java.util.*;
public class series {

    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter series:");
        String num = input.next();
        String[] s = num.split(",");
        int[] n = new int[s.length];
        for(int i=0;i<s.length;i++)
        {  //for(int j=0;j<s[i].length();j++)
              n[i] = s[i].charAt(0)*10+s[i].charAt(1);
             // System.out.println(n[i]);
        }int c=0;
        for(int i=1;i<s.length;i++)
        {  if(n[i]!=n[i-1]+1)
            c++;
        }
        if(c!=0)
            System.out.println(num+" are non consecutive numbers");
        else
            System.out.println(num+" are consecutive numbers");
    }
}
