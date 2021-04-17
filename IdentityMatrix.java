package com.practice;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		System.out.println("Enter the size of matrix");
		int t=sc.nextInt();
		int a[][]=new int[t][t];
		
		System.out.println("Enter the elements of matrix");
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<t;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		 for(int i = 0; i < t; i++){    
             for(int j = 0; j < t; j++){    
               if(i == j && a[i][j] != 1){    
                   flag = false;    
                   break;    
               }    
               if(i != j && a[i][j] != 0){    
                   flag = false;    
                   break;    
               }    
             }    
         }    
             
         if(flag)   
         {
             System.out.println("Given matrix is an identity matrix");    
         }
         else
         {
             System.out.println("Given matrix is not an identity matrix");    
         }
         sc.close();

	}

}
