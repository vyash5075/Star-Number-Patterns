import java.util.Scanner;
/**
 * 
    ** 
   ***
  ****
 *****
  ****
   ***
    **
     * 
 */
public class leftpascaltriangel {
     public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      int rows=sc.nextInt();
      int columns=sc.nextInt();
      for(int i=1;i<=rows;i++)
      {
          for(int j=columns-1;j>=i;j--)
          {
              System.out.print(" ");
          }
          for(int k=1;k<=i;k++)
          {
              System.out.print("*");    
      }
            System.out.println("");
      }
      for(int i=1;i<=rows;i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print(" ");
          }
          for(int k=rows-1;k>=i;k--)
          {
              System.out.print("*");
          }
          System.out.println("");
           
}
    }
}
