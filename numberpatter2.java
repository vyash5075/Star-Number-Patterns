import java.util.Scanner;
/**
1  
1 2  
1 2 3  
1 2 3 4  
1 2 3 4 5 
 */
public class numberpatter2 {
        public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the no. of rows");
         int rows=sc.nextInt();
         
         for(int i=0;i<rows;i++)
         {int count=1;
             for(int j=0;j<=i;j++)
             {
                 System.out.print(count+" ");
                 count++;
             }
             System.out.println(" ");
         }
        
    }
}
