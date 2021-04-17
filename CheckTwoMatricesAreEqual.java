package com.practice;

import java.util.Scanner;

public class CheckTwoMatricesAreEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			Scanner sc=new Scanner(System.in);
			boolean flag=true;
			System.out.println("Enter the size of matrix");
			int t=sc.nextInt();
			int a[][]=new int[t][t];
			int b[][]=new int[t][t];
			
			System.out.println("Enter the elements of the 1st matrix");
			for(int i=0;i<t;i++)
			{
				for(int j=0;j<t;j++)
				{
					a[i][j]=sc.nextInt();
				}
				
			}
			System.out.println("Enter the elements of the 2nd matrix");
			for(int i=0;i<t;i++)
			{
				for(int j=0;j<t;j++)
				{
					b[i][j]=sc.nextInt();
				}
				
			}
			
			for(int i=0;i<t;i++)
			{
				for(int j=0;j<t;j++)
				{
					if(a[i][j]!=b[i][j]) {
						flag=false;
						break;
					}
				}
				
			}
			if(flag)
			{
				System.out.println("Matrices are equal");
			}
			else 
			{
				System.out.println("Matrices are not equal");
				
			}
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
