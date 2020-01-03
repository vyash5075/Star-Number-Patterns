import java.util.*;
/**
 *
 * @author yash verma
 */
public class snakepatternprinting {
    public static String printzigzag(String str,int n)
    {
        String s="";
        if(n==1)
        {
            System.out.print(str);
            return str;
        }
        char str1[]=str.toCharArray();           //convert string to array
        int len=str.length();                 // length of string
        String arr[]=new String [n];          // declare new array
        Arrays.fill(arr," ");                 // fill new array with spaces
        
        int row=0;
        boolean down=true;
        for(int i=0;i<len;i++)
        {
            arr[row]=arr[row]+str1[i];
            if(row==n-1)
            {
                down=false;
            }
            else if(row==0)
            {
                down=true;
            }
            if(down)
            {
                row++;
            }
            else{
                row--;
            }
        }
        for(int i=0;i<n;i++)
        {
            s=s+arr[i];
        }
        return s;
    }
    public static void main(String args[])
    {
        String str="geeksforgeeks";
        int n=3;
        System.out.print(printzigzag(str,n));
    }
            
}
