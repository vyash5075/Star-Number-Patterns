
package starpatterns;
import java.util.*;
/**
10101
01010
10101
01010
10101
 */
public class binarynumberpattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            int num;
            if(i%2==0)
            {
                num=0;
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);
                      
                    num = (num == 0)? 1 : 0;
                }
                System.out.println();
            }
            else{
                num=1;
                for(int j=1;j<=rows;j++)
                {
                    System.out.print(num);
                    num = (num==0)?  1 : 0;
                }
                System.out.println();
           
        }
    }
}
}
