import java.util.*;
/**
     A
    AA
   AAA
  AAAA
 AAAAA
 */
public class alphabetleftriangl {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int rows=sc.nextInt();
        for( int i=1;i<=rows;i++)
        {
            for(int j=i;j<=rows;j++)
            {
                System.out.print(" ");
            }
            int a=65;
            for(int k=1;k<=i;k++)
            {
                System.out.print((char)a);
            }
            System.out.println("");
        }
    }
}
