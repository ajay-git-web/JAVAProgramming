package com.logical;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number of rows u want: ");
		int number=sc.nextInt();
		int count=number*2-1; //this is the condition to match row number
		for(int i=1;i<=number;i++) {
			for(int k=1;k<=i;k++)
				System.out.print(" ");
			for(int j=1;j<=count;j++) {
				System.out.print("*");
			}
			count=count-2;
			System.out.println();
		}
	}

}

/* op
Enter a number of rows u want: 5
 *********
  *******
   *****
    ***
     *
  
 */