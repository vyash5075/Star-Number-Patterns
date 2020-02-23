/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpatterns;
import java.util.*;
/**
       input: 5
  o:    5432*
        543*1
        54*21
        5*321       
        *4321
 * @author yash verma
 */
public class competitiveques {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n*n;
        int j=1;
        int k=5;
        for(int i=0;i<m;i++)
        {
           
                if(j==k)
                {
                    System.out.print("*");
                    j++;
                    k--;
                }
                if(k==0)
                {
                         k=5;
                                      
                    System.out.println();
                }
                else{
                     System.out.print(k);
                k--;
               
                } 
        }
        
    }
}
