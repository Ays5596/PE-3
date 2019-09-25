package ex;
import java.util.*;
public class genExcept {
      public  static  void main(String [] args){
          Scanner input = new Scanner(System.in);
          System.out.println("Enter size of array:");

              int n = input.nextInt();
              try{
              if(n<0)
                  throw new NegativeArraySizeException();
              int[] arr = new int[n];
              System.out.println("you entered"+n);
          }
          catch(NegativeArraySizeException e){
              System.out.println(e);
              System.out.println("Negative ArraySize Exception caught");
          }
              try {
                  int[] arr = new int[n];
                  for(int i=0;i<=n;i++)
                      System.out.println(arr[i]);
              }
              catch (IndexOutOfBoundsException e){
                  System.out.println("IndexOutOfBoundsException caught");
              }
          try{
              String str = null;
              if(str.equals("gfg"))
              {}//  throw new NullPointerException();
          }
          catch (NullPointerException e){
              System.out.println("NullPointerException caught");
          }

      }
}
