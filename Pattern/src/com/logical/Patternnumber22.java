package com.logical;

import java.util.Scanner;

public class Patternnumber22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows u want:");
		int number=sc.nextInt();
		int count;
		for(int i=0;i<number;i++) {
			count=number;
			for(int j=1;j<=number;j++) {
				System.out.print(count+" ");
				if(j<=i) 
					count=count-i;
				
				
			}System.out.println();
		}

	}

}
