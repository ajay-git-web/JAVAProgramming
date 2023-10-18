package com.gfg;

import java.util.Scanner;

public class NumberIncreasingReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}


/*

output-
Enter a number of rows u want: 
5
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/