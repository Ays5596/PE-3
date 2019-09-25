package ex;
import java.util.*;
public class rmvowel {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type words:");
        String word = input.nextLine();
        String[] s = word.split(" ");
        System.out.println(s.length);
        String[] p = new String[s.length];
        String q ="";
        for(int i=0;i<s.length;i++)
        {   for(int j=0;j<s[i].length();j++)
        { //  p[i] = "";
            if(s[i].charAt(j)!='a' & s[i].charAt(j)!='e' & s[i].charAt(j)!='i' & s[i].charAt(j)!='o' & s[i].charAt(j)!='u' ){
                q = q + s[i].charAt(j);
                p[i] = q;

        }
        } q = "";
        }
        for(int i=0;i<s.length;i++)
        {

            System.out.print(p[i]);

            System.out.println();
        }

    }
}
