package ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
public class frequency {

    public static void main(String [] args) throws IOException
    {
        Scanner myObj = new Scanner(System.in);
        String s=myObj.nextLine();
        int count=0;
        FileReader read=new FileReader(s);
        BufferedReader br=new BufferedReader(read);
        String q=br.readLine();
        Integer l;
        int a[]=new int[1000];
        Map <String ,Integer> m=new HashMap<>();
        while(q!=null)
        {
            String u[]=q.split(" ");


            for(int i = 0;i<u.length;i++)
            {
                l=m.get(u[i]);
                if(l==null)
                {

                    l=1;

                }
                else
                {
                    l= l+1;
                }

                m.put(u[i], l);

            }
            q=br.readLine();


        }
        br.close();
        for(Map.Entry<String, Integer> entry:m.entrySet())
        {
            System.out.println(entry.getKey()+ "->" + entry.getValue());
        }

    }


}


