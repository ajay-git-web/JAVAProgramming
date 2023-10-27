package com.gfg;

import java.util.Scanner;

public class NumberTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int k=i;k<number;k++)
				System.out.print(" ");
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}System.out.println();
		}
		
	}

}

/*

Enter a number of rows u want:
5
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
*/