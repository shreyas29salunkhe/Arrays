package com.practice;

import java.util.Scanner;

public class CheckSymmetricMatrix {

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
		System.out.println("Printing the input matrix :");
        
        for (int i = 0; i < t; i++)
        {
            for (int j = 0; j < t; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
             
            System.out.println();
        }
        
        for (int i = 0; i < t; i++)
        {
            for (int j = 0; j < t; j++)
            {
                if(a[i][j] != a[j][i])
                {
                    flag = false;
                    break;
                }
            }
        }
         
        if(flag)
        {
            System.out.println("The given matrix is symmetric...");
        }
        else
        {
            System.out.println("The given matrix is not symmetric...");
        }
        sc.close();

	}

}
