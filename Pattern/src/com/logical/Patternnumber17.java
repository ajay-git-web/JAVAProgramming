package com.logical;

import java.util.Scanner;

public class Patternnumber17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int k=number;k>=i;k--)
				System.out.print(" ");
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch=(char) (ch+1);
			}
			for(int j=1;j<i;j++) {
				ch=(char) (ch-2);//increamented charcter need to set again 'A','B' resp
				System.out.print(ch);
				ch=(char) (ch+1);
			}System.out.println();
		}
	}

}
