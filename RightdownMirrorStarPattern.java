import java.util.*;
/**
 *****
  ****
   ***
    **
     *
 */
public class RightdownMirrorStarPattern {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      int rows=sc.nextInt();
      int columns=sc.nextInt();
     
      for(int i=1;i<=rows;i++)
      {
          for(int j=2;j<=i;j++)
          {
              System.out.print("  ");
          }
          for(int k=rows;k>=i;k--)
          {
              System.out.print(" *");
          }
          System.out.println("");
           
}
    } 
}
