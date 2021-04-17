package com.practice;

import java.util.Scanner;

public class SumOfRowsAndColumnsOfMatrix {

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
			
			
			
			
			for(int i=0;i<t;i++)
			{
				int sum1=0;
				for(int j=0;j<t;j++)
				{
					
						sum1+=a[i][j];
					
				}
				System.out.println("Sum of"+(i+1)+" Rows is: "+sum1);
			}
			
			
			for(int i=0;i<t;i++)
			{
				int sum2=0;
				for(int j=0;j<t;j++)
				{
					
						sum2+=a[j][i];
					
				}
				System.out.println("Sum of "+(i+1)+" Columns is: "+sum2);
			}
			
			
			sc.close();
			}
			catch(Exception e)
			{
				
			}

	}

}
