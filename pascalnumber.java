import java.util.*;

/**
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1
 */
public class pascalnumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            int val=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(val+" ");
                val=val*(i-j)/(j+1);
            }
            System.out.println("");
        }
    }
}
