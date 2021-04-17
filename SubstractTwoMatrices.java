package com.practice;


import java.util.Scanner;
class subMatrices{
	public void sub(int a[][],int b[][],int c[][],int t)
	{
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<t;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}		
	}
	
	
}
public class SubstractTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		subMatrices obj=new subMatrices();
		System.out.println("Enter the size of matrix");
		int t=sc.nextInt();
		int a[][]=new int[t][t];
		int b[][]=new int[t][t];
		int c[][]=new int[t][t];
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
		System.out.println("The Substraction of two matrices is:- ");
		obj.sub(a,b,c,t);
		sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
