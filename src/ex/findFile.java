package ex;
import java.util.*;
import java.io.*;
public class findFile {
       public static void main(String[] args)throws IOException{
               Scanner input= new Scanner(System.in);
               System.out.println("Enter file:");
               String str = input.nextLine();
               File file = new File(str);
               File[] flist = file.listFiles();

           System.out.println("Name extension:");
           String s = input.nextLine();
           for(int i=0;i<flist.length;i++){
               if(flist[i].getName().toLowerCase().endsWith(s)){
                   FileInputStream st = new FileInputStream(flist[i]);
                   byte[] arr =  new byte[flist.length];
                   int c =0;
                   while((c = st.read(arr))>0)
                       System.out.println(new String(arr));
                   st.close();
               }
           }
       }
}
