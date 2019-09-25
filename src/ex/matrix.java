package ex;
import java.util.*;
public class matrix {

    public static void main(String [] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Input no. of rows of matrix:");
        int r = num.nextInt();
        System.out.println("Input no. of columns of matrix:");
        int c = num.nextInt();
        System.out.println("Input elements of first matrix:");
        int[][] m1 = new int[r][c];
        int[][] m2 = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                m1[i][j] = num.nextInt();
        }
        System.out.println("Input elements of second matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                m2[i][j] = num.nextInt();
        }
        System.out.println("Sum of the matrices-");
        int[][] sum = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
                System.out.print("\t"+sum[i][j]);
            }
            System.out.println();
        }
    }
}
