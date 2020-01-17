/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpatterns;
import java.util.*;
/**
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
 */
public class alphabetpyramid {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows");
          System.out.print("dnfv");
        int rows=sc.nextInt();
      
        for(int i=1;i<=rows;i++)
        {
           for(int j=i;j<=rows;j++)
            {
                System.out.print(" ");
            }
        
            int a=65;
            for(int k=1;k<=i;k++)
            {
                System.out.print((char)a+" ");
                a++;
            }       
            System.out.println("");
        }
    }
}
