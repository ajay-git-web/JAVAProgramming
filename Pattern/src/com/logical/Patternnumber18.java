package com.logical;

import java.util.Scanner;

public class Patternnumber18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want: ");
		int number=sc.nextInt();
		char ch=(char) (65+number);
		for(int i=1;i<=number;i++) {
			ch=(char) (ch-i);
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch=(char)(ch+1);
			}System.out.println();
		}
	}

}
/*

output
Enter a number of rows u want: 
5
E 
D E 
C D E 
B C D E 
A B C D E 

*/