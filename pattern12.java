import java.util.*;
/**
  
 
  
 ******* 
  ***** 
   *** 
    *  

 */
public class pattern12 {
 public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no. of rows");
    int rows=sc.nextInt();
    int space=1;
    for(int j = 1; j<= rows- 1; j++)
    {
        for(int i = 1; i<= j; i++)
        {
            System.out.print(" ");
            
        }
       for (int k = 1; k<= 2 * (rows - j) - 1; k++)
        {
        System.out.print("*");
        }
        System.out.println(" ");
    }
}
}
   
