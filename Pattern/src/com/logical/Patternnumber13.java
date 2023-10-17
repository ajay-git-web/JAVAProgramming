package com.logical;

import java.util.Scanner;

public class Patternnumber13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want: ");
		int number=sc.nextInt();
		int cnt=1;
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(cnt+" ");
				cnt=cnt+1;
			}System.out.println();
		}
	}

}
/*

Enter a number of rows u want: 
6

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 

*/