import java.util.*;
/**
 *
1  
2 2  
3 3 3  
4 4 4 4  
5 5 5 5 5
 */
public class nuumberpattern3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int rows=sc.nextInt();
         int val=1;
        for(int i=0;i<rows;i++)
            
        {
           
            for(int j=0;j<=i;j++)
            {
                System.out.print(val+" ");
            }
            System.out.println(" ");
            val++;
        }
    }
}
