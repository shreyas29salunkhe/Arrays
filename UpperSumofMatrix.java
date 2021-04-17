package com.practice;

import java.util.Scanner;

public class UpperSumofMatrix {
	public static void main(String[] args) {
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
		 
	     int upper_sum = 0;
	        for (int i = 0; i < t; i++) {
	            for (int j = 0; j < t; j++)
	            {
	                if (i <= j)
	                {
	                    upper_sum += a[i][j];
	                }
	            }
	        }
	        System.out.println("Upper sum is " + upper_sum);
	        sc.close();
	}

}
