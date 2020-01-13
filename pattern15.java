import java.util.*;
/*


   * 
  * * 
 *   * 
*     * 
 *   * 
  * * 
   * 


*/

public class pattern15 {
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no. of rows");
    int rows=sc.nextInt();
    int mid=rows/2;
    for(int i=1;i<=mid;i++)
    {
        for(int j=mid-1;j>=i;j--)
        {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i- 1; k++)
        {    
        if(k>1&&k<(i*2)-1)
           {
               System.out.print(" ");
            }
            else{
                 System.out.print("*");
            }
        }
        System.out.println(" ");
    }
     for(int j = 1; j<= mid- 1; j++)
    {
        for(int i = 1; i<= j; i++)
        {
            System.out.print(" ");
            
        }
       for (int k = 1; k<= 2 * (mid - j) - 1; k++)
        {
        if(k>1&&k< 2 * (mid - j) - 1)
           {
               System.out.print(" ");
            }
            else{
                 System.out.print("*");
            }
        }
        System.out.println(" ");
    }
    
}
}
