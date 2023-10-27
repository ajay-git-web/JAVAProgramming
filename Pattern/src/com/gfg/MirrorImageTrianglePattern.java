package com.gfg;

import java.util.Scanner;

public class MirrorImageTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number=sc.nextInt();
		for(int i=1;i<number;i++) {
			for(int k=1;k<=i;k++)
				System.out.print(" ");
			for(int j=i;j<=number;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
		for(int i=number;i>=1;i--) {
			for(int k=1;k<=i;k++)
				System.out.print(" ");
			for(int j=i;j<=number;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}


/*

Enter a number of rows u want:
4
 1 2 3 4 
  2 3 4 
   3 4 
    4 
   3 4 
  2 3 4 
 1 2 3 4 

*/