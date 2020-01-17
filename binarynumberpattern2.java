
package starpatterns;
import java.util.Scanner;
/**
 *
1
10
101
1010
10101
 */
public class binarynumberpattern2 {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            int num=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(num);
                num=(num==0)?1:0;
            }
            System.out.println();
        }
        
}
}
