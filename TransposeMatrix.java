package com.practice;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of matrix");
		int t=sc.nextInt();
		int a[][]=new int[t][t];
		int b[][]=new int[t][t];
		System.out.println("Enter the elements of matrix");
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<t;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<t;j++)
			{
				b[i][j]=a[i][j];
			}
		}
		System.out.println("Original Matrix: ");
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<t;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix: ");
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<t;j++)
			{
				System.out.print(b[j][i]+" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
