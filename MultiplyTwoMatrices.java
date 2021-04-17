package com.practice;
import java.util.Scanner;
class multMatrices{
	public void mult(int a[][],int b[][],int c[][],int t)
	{
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<t;j++) {
				c[i][j]=0;
				for(int k=0;k<t;k++)
			{
				c[i][j]+=a[i][k]*b[k][j];
				
			}
			System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}		
	}
	
	
}
public class MultiplyTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		multMatrices obj=new multMatrices();
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
		System.out.println("The Multiplication of two matrices is:- ");
		obj.mult(a,b,c,t);
		sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
