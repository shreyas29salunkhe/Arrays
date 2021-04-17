package com.practice;

import java.util.Scanner;

public class SumOfMinorDigonalElementsMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
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
			System.out.println("The elements of the matrix ");
			for(int i=0;i<t;i++)
			{
				for(int j=0;j<t;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
			int sum=0;
			int j=0;
			int k=0;
			for ( j = a.length-1, k = 0; j >= 0; j--, k++) {
		        sum += a[j][k];
		}
			
			System.out.println("\n\nSum of Minor Digonal elements of the matrix is: "+sum);
			sc.close();
			}
			catch(Exception e)
			{
				
			}

	}

}
