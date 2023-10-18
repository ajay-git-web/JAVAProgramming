package com.logical;

import java.util.Scanner;

public class Patternnumber15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number=sc.nextInt();
		
		for(int i=1;i<=number;i++) {
			char ch='A';
			for(int j=number;j>=i;j--) {
				System.out.print(ch+" ");
				ch=(char) (ch+1);
			}System.out.println();
		}
	}

}

/*

output
Enter a number of rows u want:
5
A B C D E 
A B C D 
A B C 
A B 
A 

*/