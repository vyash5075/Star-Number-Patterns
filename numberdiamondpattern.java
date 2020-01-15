import java.util.*;
/**
   1
  212
 32123
4321234
 32123
  212
   1
 * @author yash verma
 */
public class numberdiamondpattern {
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no. of rows");
       int rows=sc.nextInt();
       int mid=(rows/2)+1;
       for(int i=1;i<=mid;i++)
       {
           for(int j=1;j<=mid-i;j++) 
           {
               System.out.print(" ");
           }
           for(int k=i;k>=1;k--)
           {
               System.out.print(k);
           }
           for(int l=2;l<=i;l++)
           {
               System.out.print(l);
           }
           System.out.println();
       }
       for(int i=mid-1;i>=1;i--)
       {
           for(int j=i;j<=mid-1;j++)
           {
               System.out.print(" ");
           }
             for(int k=i;k>=1;k--)
           {
               System.out.print(k);
           }
              for(int l=2;l<=i;l++)
           {
               System.out.print(l);
           }
          
            System.out.println();
            
           
       }
   }
}
