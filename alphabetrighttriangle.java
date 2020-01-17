
package starpatterns;
import java.util.*;
/**
A
AB
ABC
ABCD
ABCDE
 */
public class alphabetrighttriangle {
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the no. of rows");
     int rows=sc.nextInt();
     for(int i=0;i<rows;i++)
     {
         int a=65;
         for(int j=0;j<=i;j++)
         {
             System.out.print((char)a);
             a++;
         }
         System.out.println();
     }
 }
}
