package com.practice;

import java.util.Scanner;

public class DisplayUpperMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of matrix");
			int t=sc.nextInt();
			int a[][]=new int[t][t];
			System.out.println("Enter the elements of the matrix");
			for(int i=0;i<t;i++)
			{
				for(int j=0;j<t;j++)
				{
					a[i][j]=sc.nextInt();
				}
				
			}
			  System.out.println("Upper triangular matrix: ");  
	            for(int i = 0; i < t; i++){  
	                for(int j = 0; j < t; j++){  
	                  if(i > j)  
	                  {
	                    System.out.print("0 ");  
	                  }
	                  else
	                  {
	                    System.out.print(a[i][j] + " ");  
	                  }
	                 }  
	                System.out.println();  
	            } 
	            sc.close();

	}

}
