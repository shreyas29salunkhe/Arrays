package com.practice;

import java.util.Scanner;

public class CheckSparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
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
		int count =0;
		int size=a.length;
		 for(int i = 0; i < t; i++){    
	            for(int j = 0; j < t; j++){    
	                if(a[i][j] == 0)    
	                    count++;    
	                }    
	            }    
	                
	        if(count > (size/2))    
	            System.out.println("Given matrix is a sparse matrix");    
	        else    
	            System.out.println("Given matrix is not a sparse matrix"); 
	        sc.close();

	}

}
